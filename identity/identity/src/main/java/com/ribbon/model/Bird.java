package com.ribbon.model;

import jakarta.persistence.*;

@Entity
public class Bird {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public Bird(int id, String birdName, boolean isMigratory, String countryWhereMostSeen) {
        this.id = id;
        this.birdName = birdName;
        this.isMigratory = isMigratory;
        this.countryWhereMostSeen = countryWhereMostSeen;
    }

    private String birdName;
    private boolean isMigratory;
    private String countryWhereMostSeen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    public boolean isMigratory() {
        return isMigratory;
    }

    public void setMigratory(boolean migratory) {
        isMigratory = migratory;
    }

    public String getCountryWhereMostSeen() {
        return countryWhereMostSeen;
    }

    public void setCountryWhereMostSeen(String countryWhereMostSeen) {
        this.countryWhereMostSeen = countryWhereMostSeen;
    }

    public Bird() {
        super();
    }

    @Override
    public String toString() {
        return "Bird{" +
                "id=" + id +
                ", birdName='" + birdName + '\'' +
                ", isMigratory=" + isMigratory +
                ", countryWhereMostSeen='" + countryWhereMostSeen + '\'' +
                '}';
    }
}
