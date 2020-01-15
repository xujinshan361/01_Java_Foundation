package com.xujinshan.pattern02.factory.singlefactory;

/**
 * 简单工厂类
 * @author xujinshan361@163.com
 *
 */
public class CarFactory02 {
	public static Car createAudi() {
		return new Audi();
	}
	public static Car createByd() {
		return new Byd();
	}
}
