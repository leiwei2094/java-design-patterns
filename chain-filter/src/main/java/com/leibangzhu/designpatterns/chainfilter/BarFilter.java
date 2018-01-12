package com.leibangzhu.designpatterns.chainfilter;

public class BarFilter implements Filter{

    @Override
    public Result handle(Handler handler, Request request) {
        System.out.println("BarFilter pre handle...");
        Result result = handler.handle(request);
        System.out.println("BarFilter after handle...");
        return result;
    }
}
