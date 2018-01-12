package com.leibangzhu.designpatterns.chain;

public class Request {
    private String description;
    private boolean handled;

    public Request(String description){
        this.description = description;
    }

    public void handled(){
        this.handled = true;
    }
}
