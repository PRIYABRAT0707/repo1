package com.ribbon.helper;

import com.ribbon.model.Bird;

import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DataManipulation {
    public void dontReturn() {
        List<Bird> bird1 = Arrays.asList(
                new Bird(177, "tom", true, "america"),
                new Bird(171, "jerry", false, "australia"),
                new Bird(27, "riverdale", true, "spain"),
                new Bird(1703, "emu", false, "france")

        );
        //simple printing of list
        //bird1.forEach(bird -> System.out.println(bird.getCountryWhereMostSeen()));


     // caomparing and sorting according to id

     /*  bird1= bird1.stream().sorted((o1, o2) -> {
            if(o1.getId()<o2.getId()){
                return 1;
            }
            else if(o1.getId()>o2.getId()){
                return -1;
            }
            return 0;
        }).collect(Collectors.toList());
       bird1.forEach(bird -> System.out.println(bird));

      */
//
//        Map<Integer,List<Bird>> nop=new HashMap<>();
//        nop.put(1,bird1);
//
    }


  /*  public static void main(String[] args) {
        DataManipulation ggg=new DataManipulation();
        ggg.dontReturn();
    }*/
}
