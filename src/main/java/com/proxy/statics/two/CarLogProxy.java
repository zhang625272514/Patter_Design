package com.proxy.statics.two;

public class CarLogProxy implements Moveable {

	public CarLogProxy(Moveable m) {
		super();
		this.m = m;
	}

	private Moveable m;
	
	@Override
	public void move() {
		System.out.println("move log before....");
		m.move();
		System.out.println("move log after");
	}

}
