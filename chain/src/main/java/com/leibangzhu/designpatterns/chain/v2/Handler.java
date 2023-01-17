package com.leibangzhu.designpatterns.chain.v2;

/**
 * @author leiwei
 */
public interface Handler<Q, S> {
    /**
     * 处理请求，返回响应
     *
     * @param request  请求
     * @param response 响应
     */
    void handle(Request<Q> request, Response<S> response);
}
