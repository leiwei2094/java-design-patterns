package com.leibangzhu.designpatterns.chainfilter;

import java.util.ArrayList;
import java.util.List;

import static com.leibangzhu.designpatterns.chainfilter.ChainBuilder.buildHandlerChain;

public class Demo {
    public static void main(String[] args) {
        Handler handler = new DefaultHandler();

        List<Filter> filters = new ArrayList<>();
        filters.add(new FooFilter());
        filters.add(new BarFilter());

        handler = buildHandlerChain(handler,filters);
        handler.handle(new Request("hello"));
    }
}
