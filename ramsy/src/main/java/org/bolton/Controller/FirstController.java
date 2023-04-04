package org.bolton.Controller;

import org.bolton.model.Registration;
import org.bolton.services.FirstWolfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping("/first")
public class FirstController {

    @Autowired
    private FirstWolfService rs;


    @GetMapping("/")
    public String first() {

        return "home";
    }

    @ResponseBody
    @PostMapping("/submit")
    public String first1(@ModelAttribute("reg") Registration reg, BindingResult br) {
/*
        if(br.hasErrors()){
            redirectView.setUrl("/");
            return "you have entered wrong details";
        }*/
        System.out.println(reg.getFile());
        // rs.saveUser(reg);

        // System.out.println(reg.getState());
        return "successfully submitted";
    }


    @RequestMapping("/group")
    public String me() {

        return "group";
    }
}
