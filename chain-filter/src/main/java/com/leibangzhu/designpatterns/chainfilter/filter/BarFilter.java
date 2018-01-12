package com.leibangzhu.designpatterns.chainfilter.filter;

import com.leibangzhu.designpatterns.chainfilter.handler.Handler;
import com.leibangzhu.designpatterns.chainfilter.Request;
import com.leibangzhu.designpatterns.chainfilter.Result;

public class BarFilter implements Filter {

    @Override
    public Result handle(Handler handler, Request request) {
        System.out.println("BarFilter pre handle...");
        Result result = handler.handle(request);
        System.out.println("BarFilter after handle...");
        return result;
    }
}
