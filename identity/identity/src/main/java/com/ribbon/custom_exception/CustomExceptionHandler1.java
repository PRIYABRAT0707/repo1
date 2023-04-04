package com.ribbon.custom_exception;

import org.springframework.http.HttpStatus;

public class CustomExceptionHandler1 extends Exception{

    public CustomExceptionHandler1(String mes){
        super(mes);
   }
}
