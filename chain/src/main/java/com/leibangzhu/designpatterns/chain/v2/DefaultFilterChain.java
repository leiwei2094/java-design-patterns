package com.leibangzhu.designpatterns.chain.v2;

import java.util.List;

/**
 * @author leiwei
 */
class DefaultFilterChain implements FilterChain {
    /**
     * 目标Servlet
     */
    private final Handler defaultHandler;
    private final List<Filter> list;
    /**
     * 将要执行的过滤器下标
     */
    private int pos = 0;

    DefaultFilterChain(Handler defaultHandler, List<Filter> filters) {
        this.defaultHandler = defaultHandler;
        this.list = filters;
    }

    @Override
    public void doFilter(Request request, Response response) {
        if (pos < list.size()) {
            list.get(pos++).doFilter(request, response, this);
        } else {
            this.defaultHandler.handle(request, response);
        }
    }
}
