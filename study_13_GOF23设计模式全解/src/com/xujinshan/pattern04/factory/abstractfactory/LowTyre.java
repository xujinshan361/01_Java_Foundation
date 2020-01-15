package com.xujinshan.pattern04.factory.abstractfactory;

public class LowTyre implements Tyre{

	@Override
	public void revolve() {
		System.out.println("旋转磨损快");
	}
}
