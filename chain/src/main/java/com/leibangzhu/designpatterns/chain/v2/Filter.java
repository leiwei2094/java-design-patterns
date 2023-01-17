package com.leibangzhu.designpatterns.chain.v2;

/**
 * @author leiwei
 */
public interface Filter<Q, S> {
    /**
     * 执行filter逻辑
     *
     * @param request     请求
     * @param response    响应
     * @param filterChain FilterChain
     */
    void doFilter(Request<Q> request, Response<S> response, FilterChain filterChain);
}
