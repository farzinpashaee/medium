package com.fp.medium;

import com.fp.medium.collector.TransactionAggregationCollector;
import com.fp.medium.model.Transaction;
import com.fp.medium.model.TransactionAggregation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainApplication {

    public static void main(String[] args) {

        TransactionAggregation transactionAggregation = getListOfTransactions().stream().collect(new TransactionAggregationCollector());

    }

    public static List<Transaction> getListOfTransactions(){
        List<Transaction> list = new ArrayList<>();

        Transaction t1 = new Transaction();
        t1.setId(1L);
        t1.setUserId(1L);
        t1.setAmount(new BigDecimal(100));
        t1.setDateTime(new Date());
        list.add(t1);

        Transaction t2 = new Transaction();
        t2.setId(2L);
        t2.setUserId(1L);
        t2.setAmount(new BigDecimal(50));
        t2.setDateTime(new Date());
        list.add(t2);

        Transaction t3 = new Transaction();
        t3.setId(3L);
        t3.setUserId(1L);
        t3.setAmount(new BigDecimal(120));
        t3.setDateTime(new Date());
        list.add(t3);

        Transaction t4 = new Transaction();
        t4.setId(4L);
        t4.setUserId(1L);
        t4.setAmount(new BigDecimal(70));
        t4.setDateTime(new Date());
        list.add(t4);

        return list;
    }


}
