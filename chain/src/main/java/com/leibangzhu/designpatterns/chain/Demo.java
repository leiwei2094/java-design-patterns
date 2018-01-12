package com.leibangzhu.designpatterns.chain;

public class Demo {
    public static void main(String[] args) {
        Handler handler = new FooHandler()
                .next(new BarHandler())
                .next(new BazHandler());

        handler.handle(new Request("hello"));
    }
}
