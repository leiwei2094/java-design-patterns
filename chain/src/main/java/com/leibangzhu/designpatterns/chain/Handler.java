package com.leibangzhu.designpatterns.chain;

public abstract class Handler {

    protected Handler next;

    public abstract void handle(Request request);

    protected void doHandle(Request request){
        if (null != next){
            next.handle(request);
        }
    }

    public Handler next(Handler handler){
        if (null == next){
            this.next = handler;
        }else {
            next.next(handler);
        }
        return this;
    }
}
