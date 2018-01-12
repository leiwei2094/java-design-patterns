package com.leibangzhu.designpatterns.chainfilter.filter;

import com.leibangzhu.designpatterns.chainfilter.handler.Handler;
import com.leibangzhu.designpatterns.chainfilter.Request;
import com.leibangzhu.designpatterns.chainfilter.Result;

public interface Filter {

    // before filter
    // Result result = handler.handle(request)
    // after filter
    // return result
    Result handle(Handler handler, Request request);
}
