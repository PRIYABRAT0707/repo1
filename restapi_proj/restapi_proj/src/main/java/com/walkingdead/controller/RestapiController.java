package com.walkingdead.controller;

import com.walkingdead.model.Tws;
import com.walkingdead.services.TwsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.LinkBuilder;
import org.springframework.hateoas.server.core.ControllerEntityLinks;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.hateoas.server.core.DummyInvocationUtils.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@RestController
public class RestapiController {

    @Autowired
    public TwsServices tser;
    @GetMapping("/")
    public Tws first(){
        return tser.getMeOne();
    }
    @GetMapping("/li")
    public List<Tws> getMeTwo(){
        return tser.getMeTwsList();}


//hateoas implementation
    @GetMapping("/res")
    public EntityModel<Tws> getmeTwsLink(){
        Tws bb=tser.getMeOne();
        EntityModel<Tws> en=EntityModel.of(bb);


        Link link=WebMvcLinkBuilder.linkTo(methodOn(this.getClass()).getMeTwo()).withRel("/rod");
       // Link link= WebMvcLinkBuilder.methodOn(this.getClass()).tser.getMeTwsList().
        en.add(link);

        return en;
    }

}
