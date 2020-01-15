package com.xujinshan.pattern05.builder;

public class ChinaAirShipDirector implements AirshipDirector{

	private AirShipBuilder builder;
	
	
	public ChinaAirShipDirector(AirShipBuilder builder) {
		super();
		this.builder = builder;
	}


	@Override
	public AirShip directAirShip() {
		Engine e = builder.builderEngine();
		OrbitalModule o = builder.builderOribitalModule();
		EscapeTower et = builder.builderEscapeTower();
		
		//装配成飞船对象
		AirShip ship = new AirShip();
		ship.setEngine(e);
		ship.setEscapeTower(et);
		ship.setOrbitalModule(o);
		return ship;
	}
	
}
