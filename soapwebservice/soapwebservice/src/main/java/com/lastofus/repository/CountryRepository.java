package com.lastofus.repository;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;


@Component
public class CountryRepository {
    private static final Map<String, Country> countries=new HashMap<>();

    @PostConstruct
    public void initData(){
        Country spain=new Country();
        spain.setName("spain");
        spain.setCapital("madrid");
        spain.setPopulation(1000000);
        spain.setCurrency(Currency.EUR);
        countries.put(spain.getName(),spain);
        Country poland = new Country();
        poland.setName("Poland");
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);
        poland.setPopulation(38186860);

        countries.put(poland.getName(), poland);

        Country uk = new Country();
        uk.setName("United Kingdom");
        uk.setCapital("London");
        uk.setCurrency(Currency.GBP);
        uk.setPopulation(63705000);

        countries.put(uk.getName(), uk);

    }

    public  Country findCountry(String name){
        Assert.notNull(name,"country name should be given");
        return countries.get(name);
    }
}
