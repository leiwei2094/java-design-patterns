package com.leibangzhu.designpatterns.chain.v2;

public class LogFilter implements Filter<String, String> {
    @Override
    public void doFilter(Request<String> request, Response<String> response, FilterChain filterChain) {
        System.out.println("pre log: request is " + request.getRequest());
        filterChain.doFilter(request, response);
        System.out.println("post log: response is " + response.getResponse());
    }
}
