package com.leibangzhu.designpatterns.chainfilter;

public interface Filter {
    Result handle(Handler handler,Request request);
}
