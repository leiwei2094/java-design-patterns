package com.leibangzhu.designpatterns.chain.v2;

/**
 * @author leiwei
 */
public class EchoHandler implements Handler<String, String> {
    @Override
    public void handle(Request<String> request, Response<String> response) {
        System.out.println("echo handler: handle request");
        response.setResponse(request.getRequest());
    }
}
