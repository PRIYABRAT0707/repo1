package com.walkingdead.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Bird {
    private int id;
    private String birdName;
    private boolean isMigratory;
    private String countryWhereMostSeen;
}
