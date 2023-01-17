package com.leibangzhu.designpatterns.chain.v2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author leiwei
 */
class DefaultFilterChainBuilder implements FilterChainBuilder {

    private Handler handler;
    private List<Filter> filters = new ArrayList<>();

    public static DefaultFilterChainBuilder create() {
        return new DefaultFilterChainBuilder();
    }

    @Override
    public FilterChain build() {
        return new DefaultFilterChain(handler, filters);
    }

    public DefaultFilterChainBuilder handler(Handler handler) {
        this.handler = handler;
        return this;
    }

    public DefaultFilterChainBuilder addFilter(IFilterProvider filter) {
        this.filters.add(filter.get());
        return this;
    }

    public DefaultFilterChainBuilder addFilters(IFilterProvider... filters) {
        for (IFilterProvider filter : filters) {
            this.filters.add(filter.get());
        }
        return this;
    }

    public DefaultFilterChainBuilder addFilters(Collection<IFilterProvider> filters) {
        for (IFilterProvider filter : filters) {
            this.filters.add(filter.get());
        }
        return this;
    }
}
