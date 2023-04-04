package com.euphoria.controller;

import com.euphoria.exception.DataNotFoundexp;
import com.euphoria.model.BirdData;
import com.euphoria.model.ExchangeDetails;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CurrencyConversionController {
    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public ExchangeDetails getConverted(@PathVariable("from") String from,@PathVariable("to") String to,@PathVariable("quantity") String quantity){
        //System.out.println(quantity);

        Long l=Long.valueOf(quantity);
        return new ExchangeDetails(100L,from,to, BigDecimal.ONE,BigDecimal.valueOf(l),BigDecimal.valueOf(100),8080);


    }

    @GetMapping("currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public ExchangeDetails giveMeExchangeDetails(@PathVariable("from") String from,@PathVariable("to") String to,@PathVariable("quantity") String quantity){

        Map<String,String> urivariables=new HashMap<>();
        urivariables.put("from",from);
        urivariables.put("to",to);
        Long l=Long.valueOf(quantity);
        ResponseEntity<ExchangeDetails> re=new RestTemplate().getForEntity("http://localhost:8087/currency-exchange/from/{from}/to/{to}",ExchangeDetails.class,urivariables);

        ExchangeDetails hh=re.getBody();
        BigDecimal bb=hh.getConversionMultiple().multiply(BigDecimal.valueOf(l));
        return new ExchangeDetails(hh.getId(),hh.getFrom(),hh.getTo(),hh.getConversionMultiple(),BigDecimal.valueOf(l),bb,hh.getPort());
    }


    @GetMapping("/getb/id/{id}")
    public BirdData getBirdData(@PathVariable("id") String id) throws DataNotFoundexp{
       String url="http://localhost:9093/bird3/{id}";
        ResponseEntity<BirdData> res= new RestTemplate().getForEntity(url,BirdData.class,id, HttpMethod.GET);

        BirdData bd=res.getBody();
        System.out.println(bd);
        if(bd==null){
            throw new DataNotFoundexp("not found");
        }
        return new BirdData(bd.getId(),bd.getBirdName(),bd.isMigratory(), bd.getCountryWhereMostSeen());
    }

}
