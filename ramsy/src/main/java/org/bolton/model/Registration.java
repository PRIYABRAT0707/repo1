package org.bolton.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "registration_form")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sid;

    private String firstname;
    private String middlename;
    private String surname;
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private Date dob;

    private String username;
    private String password;
    private String email;

    private String mobilenum;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private CommonsMultipartFile file;

    public Registration(int sid, String firstname, String middlename, String surname, Date dob, String username, String password, String email, String mobilenum, String address1, String address2, String city, String state, String zip, CommonsMultipartFile file) {
        this.sid = sid;
        this.firstname = firstname;
        this.middlename = middlename;
        this.surname = surname;
        this.dob = dob;
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobilenum = mobilenum;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.file = file;
    }

    public Registration() {
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

    public CommonsMultipartFile getFile() {
        return file;
    }

    public void setFile(CommonsMultipartFile file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "sid=" + sid +
                ", firstname='" + firstname + '\'' +
                ", middlename='" + middlename + '\'' +
                ", surname='" + surname + '\'' +
                ", dob=" + dob +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobilenum='" + mobilenum + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", file=" + file +
                '}';
    }
}
