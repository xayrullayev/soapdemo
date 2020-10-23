package com.example.soap.demo.datatypes;

public class GenericParam {
    String paramKey;
    String paramValue;

    public GenericParam(String paramKey, String paramValue) {
        this.paramKey = paramKey;
        this.paramValue = paramValue;
    }

    public GenericParam() {
    }

    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    @Override
    public String toString() {
        return "GenericParam{" +
                "paramKey='" + paramKey + '\'' +
                ", paramValue='" + paramValue + '\'' +
                '}';
    }
}
