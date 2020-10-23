package com.example.soap.demo.datatypes;

import java.util.Date;

public class CheckTransactionArguments extends GenericArguments{
    String password;
    String username;
    Long serviceId;
    Long transactionId;
    Date transactionTime;
    GenericParam parameters;
}
