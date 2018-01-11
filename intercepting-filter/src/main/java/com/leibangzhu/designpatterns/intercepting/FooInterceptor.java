package com.leibangzhu.designpatterns.intercepting;

public class FooInterceptor implements Interceptor {
    @Override
    public boolean preExecute(String request) {
        System.out.println("FooInterceptor preExecute: " + request);
        return true;
    }

    @Override
    public void postExecute(String request) {
        System.out.println("FooInterceptor postExecute: " + request);
    }
}
