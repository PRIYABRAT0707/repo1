package com.utopia.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class BirdData {
    private int id;
    private String birdName;
    private boolean isMigratory;
    private String countryWhereMostSeen;
    private int port;
    private String username;
}
