package org.springjpa.jpapractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller11 {

    @GetMapping("/")
    @ResponseBody
    public String my(){
        return "hii";
    }
}
