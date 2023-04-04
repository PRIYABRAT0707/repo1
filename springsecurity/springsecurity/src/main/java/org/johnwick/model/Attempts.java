package org.johnwick.model;

import jakarta.persistence.*;

@Entity(name = "ATTEMPTS_DETAILS")
public class Attempts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ATTEMPT_ID")
    private int aid;
    @Column(name = "ATTEMPTS_USERNAME")
    private String userName;
    @Column(name = "ATTEMPT_NUMBER")
    private int numberOfAttempts;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public void setNumberOfAttempts(int numberOfAttempts) {
        this.numberOfAttempts = numberOfAttempts;
    }

    @Override
    public String toString() {
        return "Attempts{" +
                "aid=" + aid +
                ", userName='" + userName + '\'' +
                ", numberOfAttempts=" + numberOfAttempts +
                '}';
    }
}
