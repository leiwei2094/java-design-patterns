package com.leibangzhu.designpatterns.intercepting;

public class Target {
    public void execute(String request){
        System.out.println("Target executing request: " + request);
    }
}
