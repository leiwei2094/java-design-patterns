package com.leibangzhu.designpatterns.chain.v2;

public class RoleCheckFilter implements Filter<String, String> {

    private String requiredRole;

    public RoleCheckFilter(String role) {
        this.requiredRole = role;
    }

    @Override
    public void doFilter(Request<String> request, Response<String> response, FilterChain filterChain) {

        if (!request.getRequest().equals(requiredRole)) {
            response.setResponse("permission denied. need " + requiredRole + " role.");
            // no filterChain.doFilter();
        }
    }
}
