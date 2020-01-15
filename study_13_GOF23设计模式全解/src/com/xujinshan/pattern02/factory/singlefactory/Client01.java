package com.xujinshan.pattern02.factory.singlefactory;

/**
 * 测试在没有工厂模式下的情况
 * @author xujinshan361@163.com
 *
 */
public class Client01 {    //调用者

	public static void main(String[] args) {
		Car c1 = new Audi();
		Car c2 = new Byd();
		
		c1.run();
		c2.run();
	}
}
