package com.ribbon.controller;

import com.ribbon.custom_exception.CustomExceptionHandler1;
import com.ribbon.model.Form1;
import com.ribbon.service.Form1ServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SecondController {
    @Autowired
    private com.ribbon.service.Form1ServiceImplementation Form1ServiceImplementation;

    @RequestMapping("/me")
    @ResponseBody
    public List<Form1> bodies() {
        List<Form1> mm = Form1ServiceImplementation.getlistOfData();
        // mm.forEach((x)->System.out.println(x.getFirstname()+" "+x.getSurname()+" "+x.getAddress1()+" "+x.getCity()+" "+x.getState()+" "+x.getZip()));
        return mm;
    }


    @GetMapping("/databyid")
    @ResponseBody
    public Form1 getBooks(@RequestParam(name = "id") String id) {
        int hid = Integer.parseInt(id);
        System.out.println(id);
        Form1 fork = null;
        List<Form1> mk = Form1ServiceImplementation.getlistOfData();
        fork = mk.stream().filter(form1 -> form1.getSid() == hid).findFirst().get();

        return fork;
    }


    @GetMapping("/databyid/{id}")
    @ResponseBody
    public Form1 getBookss(@PathVariable(name = "id") String id) throws CustomExceptionHandler1 {
        Form1 fork = null;
        if (!(id.equals("2"))){
            throw new CustomExceptionHandler1("data not avilable");
        }
else {
            int hid = Integer.parseInt(id);
            System.out.println(id);
            List<Form1> mk = Form1ServiceImplementation.getlistOfData();
            fork = mk.stream().filter(form1 -> form1.getSid() == hid).findFirst().get();
        }
        return fork;
    }


}