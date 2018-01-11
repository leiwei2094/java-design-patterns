package com.leibangzhu.designpatterns.intercepting;

public class InterceptorManager {
    InterceptorChain chain;

    public InterceptorManager(Target target){
        chain = new InterceptorChain();
        chain.setTarget(target);
    }

    public void addInterceptor(Interceptor interceptor){
        chain.addInterceptor(interceptor);
    }

    public void execute(String request){
        chain.execute(request);
    }

}
