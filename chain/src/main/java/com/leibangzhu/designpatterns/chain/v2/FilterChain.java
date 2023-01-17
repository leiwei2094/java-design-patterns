package com.leibangzhu.designpatterns.chain.v2;

/**
 * @author leiwei
 */
public interface FilterChain {
    /**
     * FilterChain
     *
     * @param request  请求
     * @param response 响应
     */
    void doFilter(Request request, Response response);
}
