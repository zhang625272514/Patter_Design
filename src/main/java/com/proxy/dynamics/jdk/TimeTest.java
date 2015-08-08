package com.proxy.dynamics.jdk;

import java.lang.reflect.Proxy;

/**
 * Created by cheng on 2015/8/2.
 */
public class TimeTest {

    public static void main(String []args){

        Car car = new Car();
        TimeHandler timeHandler = new TimeHandler(car);

        Class<?> clazz = car.getClass();
        Moveable moveable = (Moveable)Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), timeHandler);

        moveable.move();
    }
}
