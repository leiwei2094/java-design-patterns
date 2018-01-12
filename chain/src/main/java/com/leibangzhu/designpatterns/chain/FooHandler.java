package com.leibangzhu.designpatterns.chain;

public class FooHandler extends Handler{

    @Override
    public void handle(Request request) {
        System.out.println("FooHandler pre request...");
        doHandle(request);
        System.out.println("FooHandler post request");
    }
}
