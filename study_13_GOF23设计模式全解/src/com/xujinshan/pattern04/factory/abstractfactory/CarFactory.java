package com.xujinshan.pattern04.factory.abstractfactory;

public interface CarFactory {

	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();
}
