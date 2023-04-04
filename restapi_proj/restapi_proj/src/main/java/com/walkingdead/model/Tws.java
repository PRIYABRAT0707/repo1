package com.walkingdead.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Tws {
    private int tid;
    private String companyName;
    private double price;
    private String desc;
}
