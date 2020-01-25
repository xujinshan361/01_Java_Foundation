package com.xujinshan.pattern05.builder;

public class Client {
	public static void main(String[] args) {
		
		AirshipDirector director = new ChinaAirShipDirector(new ChinaAirShipBuilder());

		AirShip ship = director.directAirShip();
		
		System.out.println(ship.getEngine().getName());
		
		ship.launch();
		
	}
}
