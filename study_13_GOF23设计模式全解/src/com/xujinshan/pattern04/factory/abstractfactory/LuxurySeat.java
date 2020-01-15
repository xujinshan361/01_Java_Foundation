package com.xujinshan.pattern04.factory.abstractfactory;

public class LuxurySeat implements Seat{

	@Override
	public void massage() {
		System.out.println("可以自动按摩");
	}
}
