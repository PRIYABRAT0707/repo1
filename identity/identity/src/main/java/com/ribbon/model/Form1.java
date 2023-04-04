package com.ribbon.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.ModelAttribute;


import java.util.Arrays;
import java.util.Date;
@Entity(name = "Form1_data")
public class Form1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sid;


    private String firstname;

    private String middlename;

    private String surname;

    private String username;

    private String password;

    private String email;

    private String mobilenum;

    private String address1;

    private String address2;

    private String city;

    private String state;

    private String zip;

    @Column(nullable = false)
    private Date dob;

    @Lob
    @Column(name = "useradhaar",nullable = false,columnDefinition = "BLOB")
    private byte[] file;

    public  byte[] getFile1() {
        return file1;
    }

    public void setFile1( byte[] file1) {
        this.file1 = file1;
    }

    @Lob
    @Column(name = "textfile",columnDefinition = "BLOB")
    private byte[] file1;

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {

        this.file=file;
    }

    public Form1() {
        super();
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilenum() {
        return mobilenum;
    }

    public void setMobilenum(String mobilenum) {
        this.mobilenum = mobilenum;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }


    @Override
    public String toString() {
        return "Form1{" +
                "sid=" + sid +
                ", firstname='" + firstname + '\'' +
                ", middlename='" + middlename + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobilenum='" + mobilenum + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", dob=" + dob +
                ", file=" + Arrays.toString(file) +
                ", file1=" + Arrays.toString(file1) +
                '}';
    }
}
