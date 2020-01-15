package com.xujinshan.pattern05.builder;

/**
 * 飞船
 * @author xujinshan361@163.com
 *
 */
public class AirShip {

	private OrbitalModule orbitalModule;     //轨道舱
	private Engine engine;          //发动机
	private EscapeTower escapeTower;      //逃离塔
	
	
	public void launch() {
		System.out.println("发射！");
	}
	public AirShip() {
		super();
	}

	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}

	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public EscapeTower getEscapeTower() {
		return escapeTower;
	}

	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}
	
}
