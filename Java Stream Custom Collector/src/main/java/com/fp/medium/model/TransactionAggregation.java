package com.fp.medium.model;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@ToString
public class TransactionAggregation {

    private BigDecimal average = BigDecimal.ZERO;
    private BigDecimal total = BigDecimal.ZERO;
    private BigDecimal max = BigDecimal.ZERO;
    private Date lastTransactionDate;
    private List<Transaction> transactionList = new ArrayList<Transaction>();

}
