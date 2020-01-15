package com.xujinshan.pattern04.factory.abstractfactory;

/**
 * 测试抽象工厂
 * @author xujinshan361@163.com
 *
 */
public class Client {

	public static void main(String[] args) {
		CarFactory factory = new LuxuryCarFactory();
		Engine e  =factory.createEngine();
		e.run();
		e.start();
	}
}
