package com.leibangzhu.designpatterns.chain.v2;

/**
 * @author leiwei
 */
public class Request<T> {
    private T request;

    public Request() {
    }

    public Request(T request) {
        this.request = request;
    }

    public T getRequest() {
        return this.request;
    }

    public void setRequest(T request) {
        this.request = request;
    }
}
