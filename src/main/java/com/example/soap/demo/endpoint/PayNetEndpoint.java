package com.example.soap.demo.endpoint;

import com.example.soap.demo.datatypes.GenericParam;
import com.example.soap.demo.datatypes.PerformTransactionArguments;
import com.example.soap.demo.payload.PerformTransactionRequest;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Date;

@Endpoint
class PayNetEndpoint {
    private static final String NAMESPACE_URI = "/paynet";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PerformTransaction")
    @ResponsePayload
    public PerformTransactionArguments PerformTransaction(@RequestPayload PerformTransactionRequest request) {
        PerformTransactionArguments response = new PerformTransactionArguments();
        response.setAmount(60000l);
        response.setPassword("test");
        response.setServiceId(1234l);
        response.setTransactionTime(new Date());
        response.setUsername("Username");
        response.setParameters(new GenericParam("request","response"));

        return response;
    }
}
