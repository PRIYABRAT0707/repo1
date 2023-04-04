package com.ribbon.controller;

import com.ribbon.model.Form1;
import com.ribbon.service.Form1ServiceImplementation;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import java.io.*;
import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Controller
public class FirstController {

    @Autowired
    private Form1ServiceImplementation Form1ServiceImplementation;

    @RequestMapping("/")
    public String homePage() {

        return "homepage";
    }
    @GetMapping("/login")
    public String first() {

        return "home";
    }

    @ResponseBody
    @PostMapping("/submit")
    public String first(@ModelAttribute(value = "myform1",binding = false) Form1 reg, @RequestParam("file") MultipartFile mm, @RequestParam("dob") String mydob,
                        @RequestParam("firstname") String firstname, @RequestParam("middlename") String middlename,
                        @RequestParam("surname") String surname, @RequestParam("username") String username, @RequestParam("password") String password,
                        @RequestParam("email") String email, @RequestParam("mobilenum") String mobilenum, @RequestParam("address1") String address1,
                        @RequestParam("address2") String address2, @RequestParam("city") String city, @RequestParam("state") String state,
                        @RequestParam("zip") String zip, BindingResult br, RedirectView rd,@RequestParam("file1") MultipartFile pp

                        ) {
        if (br.hasErrors()) {
            rd.setUrl("/err1");
        }
        reg.setCity(city);
        reg.setAddress1(address1);
        reg.setEmail(email);
        reg.setFirstname(firstname);
        reg.setMiddlename(middlename);
        reg.setPassword(password);
        reg.setMobilenum(mobilenum);
        reg.setSurname(surname);
        reg.setAddress2(address2);
        reg.setUsername(username);
        reg.setZip(zip);
        reg.setState(state);


System.out.println(mydob);

        try {
            SimpleDateFormat ss = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            Date dobdate = (Date) ss.parse(mydob);
           //System.out.println(dobdate);
            reg.setDob(dobdate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        try {
            reg.setFile(mm.getInputStream().readAllBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            byte [] bb=pp.getInputStream().readAllBytes();

            reg.setFile1(bb);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Form1ServiceImplementation.saveForm1(reg);


        return "successfully submitted";
    }

    @GetMapping("/userlogin")
    public String userLogin(){

        return "login";
    }
    @PostMapping("/loginsub")
    public ModelAndView loginSub(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest request){
      ModelAndView mm=  new ModelAndView();

      List<Form1> viewDet= this.Form1ServiceImplementation.getUserDetails(username,password);

      Form1 bb=viewDet.stream().filter(form1 -> username.equals(form1.getUsername())&&password.equals(form1.getPassword())).findFirst().get();
      //System.out.println(bb.getPassword());


        if(username.equals(bb.getUsername())&& password.equals(bb.getPassword())){
            mm.setViewName("profile");
            HttpSession hh=request.getSession();
            hh.setAttribute("myobj",bb);
        }
       else{

        }

        return mm ;
    }



}
