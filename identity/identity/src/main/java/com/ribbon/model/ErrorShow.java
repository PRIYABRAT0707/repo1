package com.ribbon.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity(name = "groovy")
public class ErrorShow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Incomminguserid")
    private int uid;

    @Column(name = "Incommingusername")
    @NotBlank(message = "name can't be empty")
    @Size(min = 5 ,max = 20,message = "name must be between 5-20")
    private String name;

    @Column(name = "Incommingusermobile")
    @NotBlank(message = "mobile number must be blank")
    @Pattern(regexp ="[987]{1}[0-9]{9}",message = "mobile number must be 10 digit and must starts with 9 or 8 or 7")
    private String mobilenum;

    @Column(name = "Incomminguseremail")
    @NotBlank(message = "please enter a valid email id")
    @Pattern(message ="abc44@gmail.com",regexp = "^[a-z A-Z]+[.-]?[a-zA-Z0-9]+@[a-zA-Z]{2,5}.[a-z]{3,6}")
    private String email;

    @Override
    public String toString() {
        return "ErrorShow{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", mobilenum='" + mobilenum + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobilenum() {
        return mobilenum;
    }

    public void setMobilenum(String mobilenum) {
        this.mobilenum = mobilenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
