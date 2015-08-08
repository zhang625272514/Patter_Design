package com.proxy.dynamics.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

	private Enhancer enhancer = new Enhancer();
	
	public Object getProxy(Class clazz){

		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object obj, Method m, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("invoke before...");
		proxy.invokeSuper(obj, args);
		System.out.println("invoke after...");
		return null;
	}

}
