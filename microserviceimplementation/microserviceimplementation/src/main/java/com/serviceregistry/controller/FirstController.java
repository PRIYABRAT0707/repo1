package com.serviceregistry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/me")
    public String firstOne(){
        return "as it is";
    }
}
