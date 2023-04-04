package com.euphoria.model;

import lombok.*;

import java.math.BigDecimal;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class ExchangeDetails {
    private Long id;
    private String from;
    private String to;
    private BigDecimal ConversionMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmount;
    private int port;
}
