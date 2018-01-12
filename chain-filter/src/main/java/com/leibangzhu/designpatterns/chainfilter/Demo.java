package com.leibangzhu.designpatterns.chainfilter;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Handler handler = new DefaultHandler();

        List<Filter> filters = new ArrayList<>();
        filters.add(new FooFilter());
        filters.add(new BarFilter());

        handler = buildHandlerChain(handler,filters);
        handler.handle(new Request("hello"));
    }

    private static Handler buildHandlerChain(Handler handler,List<Filter> filters){
        Handler last = handler;
        for (int i = filters.size() - 1; i >= 0; i --){
            Filter filter = filters.get(i);
            Handler next = last;

            last = request -> filter.handle(next,request);
        }
        return last;
    }
}
