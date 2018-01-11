package com.leibangzhu.designpatterns.intercepting;

public class Client {
    public static void main(String[] args) {

        InterceptorManager manager = new InterceptorManager(new Target());
        manager.addInterceptor(new FooInterceptor());
        manager.addInterceptor(new BarInterceptor());

        manager.execute("hello");
    }
}
