package com.utopia.model;

import lombok.*;

import java.math.BigDecimal;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ExchangeValue {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private int port;


}
