package com.xujinshan.pattern05.builder;

public class ChinaAirShipBuilder implements AirShipBuilder{

	//StringBuilder 以后学习XML解析中，JDOM库中的类，DOMBuilder，SAXBuilder
	@Override
	public Engine builderEngine() {
		System.out.println("构建中国牌发动机！");
		return new Engine("中国牌发动机");
	}
	
	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("构建中国牌逃逸塔");
		return new EscapeTower("中国牌逃逸塔");
	}
	
	@Override
	public OrbitalModule builderOribitalModule() {
		System.out.println("构建中国牌轨道舱");
		return new OrbitalModule("中国牌轨道舱");
	}
}
