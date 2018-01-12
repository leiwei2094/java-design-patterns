package com.leibangzhu.designpatterns.chain;

public class BarHandler extends Handler {
    @Override
    public void handle(Request request) {
        System.out.println("BarHandler pre request...");
        doHandle(request);
        System.out.println("BarHandler post request");
    }
}
