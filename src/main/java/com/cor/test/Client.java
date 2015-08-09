package com.cor.test;

import com.cor.handler.RequestHandler;
import com.cor.handler.RequestHandlerFactory;
import com.cor.modle.Request;

/**
 * Created by cheng on 2015/8/9.
 */
public class Client {

    public static void main(String[] args) {
        RequestHandler rh = RequestHandlerFactory.getRequestHandler();
        rh.handRequest(new Request());
    }
}
