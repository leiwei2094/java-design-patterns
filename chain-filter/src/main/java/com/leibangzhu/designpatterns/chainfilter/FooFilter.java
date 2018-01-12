package com.leibangzhu.designpatterns.chainfilter;

public class FooFilter implements Filter {
    @Override
    public Result handle(Handler handler, Request request) {
        System.out.println("FooFilter pre handle...");
        Result result = handler.handle(request);
        System.out.println("FooFilter after handle...");
        return result;
    }
}
