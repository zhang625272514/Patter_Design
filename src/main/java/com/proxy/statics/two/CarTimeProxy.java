package com.proxy.statics.two;

public class CarTimeProxy implements Moveable {

	public CarTimeProxy(Moveable m) {
		super();
		this.m = m;
	}

	private Moveable m;
	
	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("move time before....");
		m.move();
		long endtime = System.currentTimeMillis();
		System.out.println("move time after"
				+ (endtime - starttime));
	}

}
