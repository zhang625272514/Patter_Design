package com.cor.handler;

import java.io.IOException;
import java.util.*;

/**
 * Created by cheng on 2015/8/9.
 */
public class RequestHandlerFactory {

    public static RequestHandler getRequestHandler(){

        List<RequestHandler> requestHandlerList = new ArrayList<RequestHandler>();

        try {
            Properties properties = new Properties();
            properties.load(RequestHandlerFactory.class.getResourceAsStream("/cor/handler.properties"));
            Set<Object> keyset = properties.keySet();
            for(Iterator it = keyset.iterator(); it.hasNext();){
                String key = (String)it.next();
                System.out.println("load key" + key);
                String value = properties.getProperty(key);
                System.out.println("load key:" + key + ",value:" + value);
                RequestHandler requestHandler = (RequestHandler)Class.forName(value).newInstance();
                requestHandlerList.add(requestHandler);
            }
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

        int length = requestHandlerList.size();

        if(length > 0){
            RequestHandler head = requestHandlerList.get(0);
            head.next = null;
            RequestHandler index = head;

            for(int i = 1; i < length; i++){
                RequestHandler next = requestHandlerList.get(i);
                index.next = next;
                index = next;
            }
            return head;
        }
        return null;
    }
}
