package com.example.soap.demo.datatypes;

import java.util.Date;
import java.util.List;

public class GetStatementResult extends GenericResult {
    String errorMsg;
    Integer Status;
    Date timeStamp;
    List<TransactionStatement> statements;
}
