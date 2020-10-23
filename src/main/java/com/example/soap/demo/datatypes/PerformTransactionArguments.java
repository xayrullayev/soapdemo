package com.example.soap.demo.datatypes;

import java.util.Date;

public class PerformTransactionArguments extends GenericArguments {
    String password;
    String username;
    Long amount;
    GenericParam parameters;
    Long serviceId;
    Long transactionId;
    Date transactionTime;

    public PerformTransactionArguments() {
    }

    public PerformTransactionArguments(String password, String username, Long amount, GenericParam parameters, Long serviceId, Long transactionId, Date transactionTime) {
        this.password = password;
        this.username = username;
        this.amount = amount;
        this.parameters = parameters;
        this.serviceId = serviceId;
        this.transactionId = transactionId;
        this.transactionTime = transactionTime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public GenericParam getParameters() {
        return parameters;
    }

    public void setParameters(GenericParam parameters) {
        this.parameters = parameters;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Date transactionTime) {
        this.transactionTime = transactionTime;
    }

    @Override
    public String toString() {
        return "PerformTransactionArguments{" +
                "password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", amount=" + amount +
                ", parameters=" + parameters +
                ", serviceId=" + serviceId +
                ", transactionId=" + transactionId +
                ", transactionTime=" + transactionTime +
                '}';
    }
}
