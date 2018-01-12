package com.leibangzhu.designpatterns.chainfilter.filter;

import com.leibangzhu.designpatterns.chainfilter.handler.Handler;
import com.leibangzhu.designpatterns.chainfilter.Request;
import com.leibangzhu.designpatterns.chainfilter.Result;

public interface Filter {
    Result handle(Handler handler, Request request);
}
