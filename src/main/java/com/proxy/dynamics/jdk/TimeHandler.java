package com.proxy.dynamics.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by cheng on 2015/8/2.
 */
public class TimeHandler implements InvocationHandler {

    private Object target;

    public TimeHandler(Object target){
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        long startTime = System.currentTimeMillis();
        System.out.println("move before ....");

        method.invoke(target);

        long endTime =System.currentTimeMillis();

        System.out.println("time chazhi:" + (endTime - startTime));

        return null;
    }
}
