package com.ribbon.helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordPatternCreation {

    public boolean getPassword( String input){
        Pattern pat= Pattern.compile("^[A-Z][a-z A-Z]+[!@#$%^&*]{1}[0-9]{2,6}");
        Matcher mm=pat.matcher(input);
        if(mm.matches()){
            return true;
        }
        else{
            return false;
        }

    }
    public boolean getEmail( String input){
        Pattern pat= Pattern.compile("^[a-z A-Z]+[.-]?[a-zA-Z0-9]+@[a-zA-Z]{2,5}.[a-z]{3,6}");
        Matcher mm=pat.matcher(input);
        if(mm.matches()){
            return true;
        }
        else{
            return false;
        }

    }
    public boolean getMobileNumber( String input){
        Pattern pat= Pattern.compile("[987]{1}[0-9]{9}");
        Matcher mm=pat.matcher(input);
        if(mm.matches()){
            return true;
        }
        else{
            return false;
        }

    }




  /*  public static void main(String[] args) {
        PasswordPatternCreation kk=new PasswordPatternCreation();
        boolean bool=kk.getPassword("Saipadapanda%199778");
        System.out.println(bool);

        boolean bool1=kk.getEmail("Pandapriy-abrat4@gmail.com");
        System.out.println(bool1);

        boolean bool3=kk.getMobileNumber("9000099998");
        System.out.println(bool3);
    }*/
}
