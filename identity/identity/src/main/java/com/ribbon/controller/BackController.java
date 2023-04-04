package com.ribbon.controller;

import com.ribbon.model.Human;
import com.ribbon.service.HumanDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class BackController {

    @Autowired
    private com.ribbon.service.HumanDataService HumanDataService;

    @RequestMapping("/gru")
    public String gru(){

        return "gru";
    }

    @GetMapping("/grusub")
    @ResponseBody
    public String gruSub(@RequestParam("hname") String hname, @RequestParam("hdob") String hdob,@ModelAttribute(value = "me",binding = false) Human human){
        human.setHname(hname);
        System.out.println(hdob);
        try {

            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            sdf.get2DigitYearStart();
            Date dd= sdf.parse(hdob);

            human.setHdob(dd);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        HumanDataService.SaveHuman(human);

        return "success";
    }
}
