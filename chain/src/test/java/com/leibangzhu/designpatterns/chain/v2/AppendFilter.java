package com.leibangzhu.designpatterns.chain.v2;

public class AppendFilter implements Filter<String, String> {

    private String requestAppend;
    private String responseAppend;

    public AppendFilter(String requestAppend, String responseAppend) {
        this.requestAppend = requestAppend;
        this.responseAppend = responseAppend;
    }

    @Override
    public void doFilter(Request<String> request, Response<String> response, FilterChain filterChain) {
        System.out.println("append filter pre: ");
        request.setRequest(request.getRequest() + requestAppend);

        filterChain.doFilter(request, response);

        System.out.println("append filter post: ");
        response.setResponse(response.getResponse() + responseAppend);
    }
}
