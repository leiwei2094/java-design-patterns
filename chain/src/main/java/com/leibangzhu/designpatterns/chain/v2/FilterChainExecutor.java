package com.leibangzhu.designpatterns.chain.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leiwei
 */
public class FilterChainExecutor {
    private Handler handler;
    private List<IFilterProvider> filters;

    public FilterChainExecutor(FilterChainExecutorBuilder builder) {
        this.handler = builder.handler;
        this.filters = builder.filters;
    }

    public static FilterChainExecutorBuilder builder() {
        return new FilterChainExecutorBuilder();
    }

    public Response execute(Request request) {

        FilterChain chain = DefaultFilterChainBuilder.create().addFilters(filters).handler(handler).build();

        Response response = new Response();
        chain.doFilter(request, response);
        return response;
    }

    public static class FilterChainExecutorBuilder {
        private Handler handler;
        private List<IFilterProvider> filters = new ArrayList<>();

        public FilterChainExecutorBuilder handler(Handler handler) {
            this.handler = handler;
            return this;
        }

        public FilterChainExecutorBuilder addFilter(IFilterProvider filter) {
            this.filters.add(filter);
            return this;
        }

        public FilterChainExecutor build() {
            return new FilterChainExecutor(this);
        }
    }
}
