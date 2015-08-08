package com.proxy.statics.one;

public class Client {

	public static void main(String[] args) {
//		Car car = new Car();
//		car.move();
//		Moveable m = new Car2();
//		m.move();
		Car car = new Car();
		Moveable m = new Car3(car);
		m.move();
	}

}
