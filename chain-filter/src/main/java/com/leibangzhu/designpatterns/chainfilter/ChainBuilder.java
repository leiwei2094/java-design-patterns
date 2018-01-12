package com.leibangzhu.designpatterns.chainfilter;

import com.leibangzhu.designpatterns.chainfilter.filter.Filter;
import com.leibangzhu.designpatterns.chainfilter.handler.Handler;

import java.util.List;

public class ChainBuilder {
    public static Handler buildHandlerChain(Handler handler, List<Filter> filters){
        Handler last = handler;
        for (int i = filters.size() - 1; i >= 0; i --){
            Filter filter = filters.get(i);
            Handler next = last;

            last = request -> filter.handle(next,request);
        }
        return last;
    }
}
