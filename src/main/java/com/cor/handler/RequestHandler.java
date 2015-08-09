package com.cor.handler;

import com.cor.modle.Request;
import com.cor.modle.Response;

/**
 * Created by cheng on 2015/8/9.
 */
public abstract class RequestHandler {

    protected RequestHandler next;

    public abstract Response handRequest(Request request);

    public void setNext(RequestHandler next) {
        this.next = next;
    }
}
