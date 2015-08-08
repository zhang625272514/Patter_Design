package com.proxy.statics.one;

public class Car2 extends Car {

	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("move before....");
		super.move();
		long endtime = System.currentTimeMillis();
		System.out.println("move after"
				+ (endtime - starttime) );
	}

	
}
