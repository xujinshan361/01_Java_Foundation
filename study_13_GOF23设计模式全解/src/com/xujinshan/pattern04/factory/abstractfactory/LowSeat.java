package com.xujinshan.pattern04.factory.abstractfactory;

public class LowSeat implements Seat{

	@Override
	public void massage() {
		System.out.println("不能按摩");
	}
}
