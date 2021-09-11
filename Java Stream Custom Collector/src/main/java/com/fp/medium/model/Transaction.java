package com.fp.medium.model;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ToString
public class Transaction {

    private Long id;
    private Long userId;
    private BigDecimal amount = BigDecimal.ZERO;
    private Date dateTime;

}
