package com.xujinshan.pattern03.factory.factorymethod;

public class BydFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new Byd();
	}
}
