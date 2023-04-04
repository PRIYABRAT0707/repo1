package com.ribbon.custom_exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class MyExceptionPage extends Exception{
    public MyExceptionPage(String mes){
        super();
    }

}
