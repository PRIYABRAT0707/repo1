package com.euphoria.controller;

import com.euphoria.currencyconversionservice.CurrenceConvIdentity;
import com.euphoria.exception.DataNotFoundexp;
import com.euphoria.model.BirdData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

public class FeignController {
    @Autowired
    private CurrenceConvIdentity CurrenceConvIdentity;
    @GetMapping("/getbird/{id}")
    public BirdData getBirdData1(@PathVariable("id") String id){
       BirdData bdk= CurrenceConvIdentity.getBirdData(id);

        return bdk;
    }
}
