package com.ribbon.controller;

import com.ribbon.ServiceInterface.FormValidatorinf;
import com.ribbon.model.ErrorShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;

@Controller
@RequestMapping("/form2")
public class FifthController {

    @Autowired
    private com.ribbon.ServiceInterface.FormValidatorinf FormValidatorinf;

    @GetMapping("/form3")
    public String errorHandling(Model mo){
        mo.addAttribute("errshow" ,new ErrorShow());

        return "grimform";
    }


    @PostMapping("/form4")
    public String myHandler(@Valid @ModelAttribute("errshow") ErrorShow errorShow, BindingResult bindingResult){
   if (bindingResult.hasErrors()){
    return "grimform";
     }
   this.FormValidatorinf.saveErrorShow(errorShow);

        return "suc";
    }
}
