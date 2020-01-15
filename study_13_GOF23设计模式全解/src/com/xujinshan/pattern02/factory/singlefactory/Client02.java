package com.xujinshan.pattern02.factory.singlefactory;

/**
 * 简单工厂情况下
 * @author xujinshan361@163.com
 *
 */
public class Client02 {

	public static void main(String[] args) {
		Car c1 = CarFactory.createCar("奥迪");
		Car c2 = CarFactory.createCar("比亚迪");
		
		c1.run();
		c2.run();
	}
}
