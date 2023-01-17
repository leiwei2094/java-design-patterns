package com.leibangzhu.designpatterns.chain.v2;

import org.junit.Test;

public class DefaultFilterChainTest {

    @Test
    public void test() {

        Filter appendFilter1 = new AppendFilter("req1", "res1");
        Filter appendFilter2 = new AppendFilter("req2", "res2");
        Filter logFilter = new LogFilter();
        Filter adminRoleCheckFilter = new RoleCheckFilter("admin");

        FilterChain chain = DefaultFilterChainBuilder.create().handler(new EchoHandler()).addFilter(() -> appendFilter1)
            .addFilter(() -> appendFilter2).build();

        Response response = new Response();
        chain.doFilter(new Request("hello"), response);
        System.out.println(response.getResponse());

        chain = DefaultFilterChainBuilder.create().handler(new EchoHandler()).addFilter(() -> new LogFilter())
            .addFilter(() -> adminRoleCheckFilter).build();
        chain.doFilter(new Request("admin"), response);
        System.out.println(response.getResponse());

        chain = DefaultFilterChainBuilder.create().handler(new EchoHandler()).addFilter(() -> logFilter)
            .addFilter(() -> adminRoleCheckFilter).build();
        chain.doFilter(new Request("guest"), response);
        System.out.println(response.getResponse());
    }
}
