package com.walkingdead.services;

import com.walkingdead.model.Tws;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TwsServices {

    public Tws getMeOne(){

        return new Tws(100,"boat",2000,"hifi audio");
    }
    public List<Tws> getMeTwsList(){

        return new ArrayList<>(Arrays.asList(new Tws(100,"boat",2000,"hifi audio"),

                new Tws(101,"boult",1100,"bass quality is good"),new Tws(102,"noise",1200,"fitting is good")
       ,new Tws(103,"oppo enco bud 2",1800,"audio quality is good") ));
    }

}
