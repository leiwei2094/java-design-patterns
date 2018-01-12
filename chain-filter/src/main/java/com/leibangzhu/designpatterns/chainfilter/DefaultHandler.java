package com.leibangzhu.designpatterns.chainfilter;

public class DefaultHandler implements Handler{
    @Override
    public Result handle(Request request) {
        Result result = new Result("Default" + request.getValue());
        System.out.println("DefaultHandler is handling request: " + request.getValue());
        return result;
    }
}
