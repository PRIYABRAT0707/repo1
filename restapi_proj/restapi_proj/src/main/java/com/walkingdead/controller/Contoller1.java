package com.walkingdead.controller;


import com.walkingdead.model.Tws;
import com.walkingdead.services.TwsServices;
import jdk.jfr.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class Contoller1 {
    @Autowired

    private com.walkingdead.services.TwsServices TwsServices;

    @GetMapping("/con")

    public List<Tws> getit(){

        return TwsServices.getMeTwsList();
    }
}
