package com.leibangzhu.designpatterns.chain.v2;

/**
 * @author leiwei
 */
public class Response<T> {
    private T response;

    public Response() {
    }

    public Response(T response) {
        this.response = response;
    }

    public T getResponse() {
        return this.response;
    }

    public void setResponse(T response) {
        this.response = response;
    }
}
