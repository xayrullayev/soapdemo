package com.example.soap.demo.datatypes;

import java.util.Date;

public class GetStatementArguments extends GenericArguments{
    String password;
    String username;
    Date dateFrom;
    Date dateTo;
    Long serviceId;
    Boolean onlyTransactionId;
    GenericParam parameters;
}
