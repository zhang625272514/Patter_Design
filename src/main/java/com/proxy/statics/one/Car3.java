package com.proxy.statics.one;

public class Car3 implements Moveable {

	public Car3(Car car) {
		super();
		this.car = car;
	}

	private Car car;
	
	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("move before");
		car.move();
		long endtime = System.currentTimeMillis();
		System.out.println("move after"
				+ (endtime - starttime));
	}

}
