package com.euphoria.currencyconversionservice;

import com.euphoria.model.BirdData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "identity",url = "http://localhost:9093")
public interface CurrenceConvIdentity {
    @GetMapping("/bird3/{id}")
    public BirdData getBirdData(@PathVariable("id") String id);
}
