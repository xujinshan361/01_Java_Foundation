package com.xujinshan.opp;
/**
 * 测试接口和实现类
 * @author xujinshan361@163.com
 *
 */
public class TestInterface {
	public static void main(String[] args) {
		Volant  v = new Angel();
		v.fly();
		
		Honest  h = new GoodMan();
		h.helpOther();
		
	}
}

/**
 * 飞行接口
 * @author xujinshan361@163.com
 *
 */
interface  Volant {
	int  FLY_HEIGHT = 1000;
	void fly();
}

/**
 * 善良接口
 * @author xujinshan361@163.com
 *
 */
interface  Honest {
	void  helpOther();
}

class  Angel implements Volant,Honest { //实现类可以实现多个父类的接口

	@Override
	public void helpOther() {
		System.out.println("Angel.helpOther()");
	}

	@Override
	public void fly() {
		System.out.println("Angel.fly()");
	}	
	
}

class  GoodMan implements Honest {

	@Override
	public void helpOther() {
		System.out.println("GoodMan.helpOther()");
	}
}

class  Birdman implements Volant {

	@Override
	public void fly() {
		System.out.println("Birdman.fly()");
	}
	
}
