package com.xujinshan.pattern04.factory.abstractfactory;

public class LuxuryCarFactory implements CarFactory{

	@Override
	public Engine createEngine() {
		return new LuxuryEngine();
	}
	@Override
	public Seat createSeat() {
		return new LuxurySeat();
	}
	@Override
	public Tyre createTyre() {
		return new LuxuryTyre();
	}
}
