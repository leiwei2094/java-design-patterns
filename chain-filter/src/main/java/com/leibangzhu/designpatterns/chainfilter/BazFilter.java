package com.leibangzhu.designpatterns.chainfilter;

public class BazFilter implements Filter{
    @Override
    public Result handle(Handler handler, Request request) {
        System.out.println("BazFilter pre handle...");
        Result result = handler.handle(request);
        System.out.println("BazFilter after handle...");
        return result;
    }
}
