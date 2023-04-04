package com.ribbon.controller;

import com.ribbon.ServiceInterface.BirdServiceInterface;
import com.ribbon.model.Bird;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ControllerThymleafPractice {
    @Autowired
    private BirdServiceInterface BirdServiceInterface;

    @GetMapping("/noob")
    public String showBirdData(Model model){
       

       List<Bird> brd=this.BirdServiceInterface.getBird();brd=brd.stream().filter(bird -> bird.getCountryWhereMostSeen().equals("india")).collect(Collectors.toList());

      List<Bird> jj =brd.stream().map(bird -> {
          bird.setCountryWhereMostSeen("lebanon");
          return bird;

      }).toList();

        List<Bird> house=this.BirdServiceInterface.getBird();
        model.addAttribute("birdlist",house);
        //System.out.println(brd);
        return "bird";
    }

    //practicing conditional statement in thymeleaf template

    @GetMapping("/chase")
    public  String ThyConPrac(Model mo){

        mo.addAttribute("free",true);


        return "condi";
    }






}
