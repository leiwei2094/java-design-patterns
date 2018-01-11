package com.leibangzhu.designpatterns.intercepting;

public class BarInterceptor implements Interceptor {
    @Override
    public boolean preExecute(String request) {
        System.out.println("BarInterceptor preExecute:" + request);
        return true;
    }

    @Override
    public void postExecute(String request) {
        System.out.println("BarInterceptor postExecute:" + request);
    }
}
