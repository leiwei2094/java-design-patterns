package com.leibangzhu.designpatterns.chain.v2;

import org.junit.Test;

public class FilterChainExecutorTest {

    @Test
    public void test() {

        Filter appendFilter1 = new AppendFilter("req1", "res1");
        Filter appendFilter2 = new AppendFilter("req2", "res2");
        Filter logFilter = new LogFilter();
        Filter adminRoleCheckFilter = new RoleCheckFilter("admin");

        FilterChainExecutor executor =
            FilterChainExecutor.builder().handler(new EchoHandler()).addFilter(() -> logFilter)
                .addFilter(() -> appendFilter1).addFilter(() -> appendFilter2).addFilter(() -> adminRoleCheckFilter)
                .build();

        Response response;
        response = executor.execute(new Request("hello"));
        System.out.println(response.getResponse());

        response = executor.execute(new Request("admin"));
        System.out.println(response.getResponse());

        response = executor.execute(new Request("guest"));
        System.out.println(response.getResponse());
    }
}
