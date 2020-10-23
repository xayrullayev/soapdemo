package com.example.soap.demo.datatypes;

import java.util.Date;

public class CheckTransactionResult  extends GenericResult{
    String errorMsg;
    Integer status;
    Date timeStamp;
    Long providerTrnId;
    Integer transactionState;
    String transactionStateErrorMsg;
    Integer transactionStateErrorStatus;
}
