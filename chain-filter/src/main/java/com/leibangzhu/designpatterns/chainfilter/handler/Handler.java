package com.leibangzhu.designpatterns.chainfilter.handler;

import com.leibangzhu.designpatterns.chainfilter.Request;
import com.leibangzhu.designpatterns.chainfilter.Result;

public interface Handler {
    Result handle(Request request);
}
