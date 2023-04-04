package com.ribbon.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CurrentTimestamp;
import org.hibernate.annotations.TimeZoneColumn;
import org.hibernate.annotations.Type;
import org.hibernate.tuple.GenerationTiming;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatterRegistrar;

import java.util.Date;


@Entity
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int hid;

    private String hname;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date hdob;

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public Date getHdob() {
        return hdob;
    }

    public void setHdob(Date hdob) {
        this.hdob = hdob;
    }


    @Override
    public String toString() {
        return "Human{" +
                "hid=" + hid +
                ", hname='" + hname + '\'' +
                ", hdob=" + hdob +
                '}';
    }
}
