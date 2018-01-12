package com.leibangzhu.designpatterns.chainfilter;

public class Request {
    private String value;
    public Request(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
