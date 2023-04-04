package com.ribbon.controller;

import com.ribbon.custom_exception.CustomExceptionHandler1;
import com.ribbon.custom_exception.MyExceptionPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import java.util.*;

@RestControllerAdvice
public class ErrorController {


@ExceptionHandler(value = CustomExceptionHandler1.class)
public ResponseEntity<Object> errfoundout(CustomExceptionHandler1 cc, ServletWebRequest request){
String message=cc.getMessage();
 String path=request.getRequest().getRequestURI();
 Date dd=new Date();
    Map<String,Object> ll=new HashMap<>();
    ll.put("message",message);
    ll.put("path",path);
    ll.put("timestamp",dd);
    return new ResponseEntity<Object>(ll,HttpStatus.I_AM_A_TEAPOT);
}
@ResponseStatus(HttpStatus.NOT_FOUND)
@ExceptionHandler(value = MyExceptionPage.class)
    public Map<String ,String> mynewError(MyExceptionPage me){
    Map<String,String> nn=new HashMap<>();
    nn.put("errormes",me.getMessage());
    return nn;
}

}
