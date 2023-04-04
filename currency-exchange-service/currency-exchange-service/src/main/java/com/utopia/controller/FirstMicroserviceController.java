package com.utopia.controller;

import com.utopia.model.BirdData;
import com.utopia.model.ExchangeValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class FirstMicroserviceController {
    @Autowired
    private Environment env;
    @GetMapping("/")
    public String map1(){
        return "me";
    }

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue returnExchangeValue(@PathVariable("from")String from,@PathVariable("to") String to){
        ExchangeValue exchangeValue = new ExchangeValue(10001L, from, to, BigDecimal.valueOf(65), Integer.parseInt(env.getProperty("local.server.port")));
        return exchangeValue;

    }

}
