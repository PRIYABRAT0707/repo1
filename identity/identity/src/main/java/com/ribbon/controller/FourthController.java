package com.ribbon.controller;

import com.ribbon.ServiceInterface.Form1Service;
import com.ribbon.model.Form1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Controller
public class FourthController {
    @Autowired
    private Form1Service Form1Service;

    @GetMapping("/userdata")
    public String toSee(Model model){
       List<Form1> ll= Form1Service.getlistOfData();
      Form1 gov= ll.stream().filter(form1 -> form1.getSid()==1).findFirst().get();
      byte[] bb=gov.getFile();
        try {
            FileOutputStream fou=new FileOutputStream("C:\\SPRINGBOOT\\identity\\identity\\src\\main\\resources\\static\\image\\img1.jpg");
            fou.write(bb);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        byte[] gov1=gov.getFile1();
        try {
            FileOutputStream fou1=new FileOutputStream("C:\\SPRINGBOOT\\identity\\identity\\src\\main\\resources\\static\\documents\\doc1.pdf");
            fou1.write(gov1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//model.addAttribute("user1",ll);

        return "userdata";
    }
}
