package com.cor.handler;

import com.cor.modle.Request;
import com.cor.modle.Response;

/**
 * Created by cheng on 2015/8/9.
 */
public class ParamCheckRequestHandler extends RequestHandler {

    @Override
    public Response handRequest(Request request) {
        System.out.println("params check ....");
        if(next != null) {
            return next.handRequest(request);
        }else{
            return new Response();
        }
    }
}
