package com.example.soap.demo.datatypes;

import java.util.Date;

public class CancelTransactionResult  extends GenericResult{
    String errorMsg;
    Integer status;
    Date timeStamp;
    Integer transactionState;
}
