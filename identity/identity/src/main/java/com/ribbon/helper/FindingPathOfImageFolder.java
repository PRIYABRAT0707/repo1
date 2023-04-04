package com.ribbon.helper;

import org.springframework.web.service.invoker.UrlArgumentResolver;

import java.io.File;
import java.net.URL;
import java.util.Objects;

public class FindingPathOfImageFolder {

    public  File m1() {
        ClassLoader cd = Thread.currentThread().getContextClassLoader();
        URL url=cd.getResource("resources/image/img1.jpg");
        File f1=new File(url.getFile());
        return f1;
    }
/*
    public static void main(String[] args) {
        FindingPathOfImageFolder hh=new FindingPathOfImageFolder();
        File f2=hh.m1();
        System.out.println(f2.getPath());*/




}
