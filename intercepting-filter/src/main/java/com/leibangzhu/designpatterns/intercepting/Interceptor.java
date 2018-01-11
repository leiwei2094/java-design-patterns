package com.leibangzhu.designpatterns.intercepting;

public interface Interceptor {
    boolean preExecute(String request);
    void postExecute(String request);
}
