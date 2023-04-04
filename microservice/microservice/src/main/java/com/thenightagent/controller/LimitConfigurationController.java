package com.thenightagent.controller;

import com.thenightagent.Configuration_1;
import com.thenightagent.model.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController{
        @Autowired
        private Configuration_1 config;
/*
        @GetMapping("/limits")
public LimitConfiguration retriveLimitsFromConfigurations()
        {
        return new LimitConfiguration(1000, 1);
        }
*/

        @GetMapping("/limit1")
public Configuration_1 getConfig1(){
        return new Configuration_1(config.getMinimum(),config.getMaximum());
}

}

