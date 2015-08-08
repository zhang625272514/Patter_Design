package com.proxy.statics.one;

import java.util.Random;

public class Car implements Moveable {

	@Override
	public void move() {
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("moving....");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
