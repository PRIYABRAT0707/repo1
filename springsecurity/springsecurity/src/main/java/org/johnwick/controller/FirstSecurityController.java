package org.johnwick.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstSecurityController {
    @GetMapping("/")
    public String myFirst(){

        return "hello spring security";
    }
    @GetMapping("/map")
    public String mySecond(){
        return "i am maped in FirstController";
    }

    @GetMapping("/map1")
    public String myThird(){
        return "i am maped 3rd FirstController";
    }
}
