package com.leibangzhu.designpatterns.intercepting;

import java.util.ArrayList;
import java.util.ListIterator;

public class InterceptorChain {
    private ArrayList<Interceptor> interceptors = new ArrayList<>();
    private Target target;

    public void addInterceptor(Interceptor interceptor){
        this.interceptors.add(interceptor);
    }

    public void execute(String request){
        // 执行前置拦截
        for (Interceptor interceptor : interceptors){
            interceptor.preExecute(request);
        }
        target.execute(request);
        // 执行后置拦截
        ListIterator<Interceptor> iterator = interceptors.listIterator(interceptors.size());
        while (iterator.hasPrevious()){
            iterator.previous().postExecute(request);
        }
    }

    public void setTarget(Target target){
        this.target = target;
    }

}
