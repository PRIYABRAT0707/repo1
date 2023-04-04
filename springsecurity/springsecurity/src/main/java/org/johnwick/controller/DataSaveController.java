package org.johnwick.controller;

import org.johnwick.model.Attempts;
import org.johnwick.model.Member;
import org.johnwick.serviceinterface1.AttemptsServiceInterface;
import org.johnwick.serviceinterface1.MemberServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DataSaveController {

    @Autowired
    private org.johnwick.serviceinterface1.MemberServiceInterface MemberServiceInterface;
    @Autowired
    private org.johnwick.serviceinterface1.AttemptsServiceInterface AttemptsServiceInterface;
    @PostMapping("/member")
    @ResponseBody
    public String SaveData(@RequestBody Member mem){
        this.MemberServiceInterface.saveMember(mem);


        return "succesflly submited member data";
    }

    @PostMapping("/attempts")
    @ResponseBody
    public String SaveAttData(@RequestBody Attempts mem){
        this.AttemptsServiceInterface.saveAtempts(mem);


        return "succesfully submited attempts data";
    }

    @GetMapping("/login")
    public String myPage(){

        return "login";

    }
   /* @PostMapping("/loginsub")
    public String sub(){
        return "loginsub";
    }*/
}
