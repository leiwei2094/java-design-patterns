package com.leibangzhu.designpatterns.chain;

public class BazHandler extends Handler {
    @Override
    public void handle(Request request) {
        System.out.println("BazHandler pre request...");
        doHandle(request);
        System.out.println("BazHandler post request");
    }
}
