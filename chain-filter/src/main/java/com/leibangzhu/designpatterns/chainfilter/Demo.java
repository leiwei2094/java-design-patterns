package com.leibangzhu.designpatterns.chainfilter;

import com.leibangzhu.designpatterns.chainfilter.filter.BarFilter;
import com.leibangzhu.designpatterns.chainfilter.filter.BazFilter;
import com.leibangzhu.designpatterns.chainfilter.filter.Filter;
import com.leibangzhu.designpatterns.chainfilter.filter.FooFilter;
import com.leibangzhu.designpatterns.chainfilter.handler.DefaultHandler;
import com.leibangzhu.designpatterns.chainfilter.handler.Handler;

import java.util.ArrayList;
import java.util.List;

import static com.leibangzhu.designpatterns.chainfilter.ChainBuilder.buildHandlerChain;

public class Demo {
    public static void main(String[] args) {
        Handler handler = new DefaultHandler();

        List<Filter> filters = new ArrayList<>();
        filters.add(new FooFilter());
        filters.add(new BarFilter());
        filters.add(new BazFilter());

        handler = buildHandlerChain(handler,filters);
        handler.handle(new Request("hello"));
    }
}
