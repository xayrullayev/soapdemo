package com.example.soap.demo.datatypes;

import java.util.Date;

public class PerformTransactionResult extends GenericResult {
    String errorMsg;
    Integer status;
    Date timeStamp;
    GenericParam parameters;
    Long providerTrnId;
}
