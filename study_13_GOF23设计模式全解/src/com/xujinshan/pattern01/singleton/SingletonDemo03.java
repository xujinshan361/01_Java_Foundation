package com.xujinshan.pattern01.singleton;

/**
 * 双重检查锁实现单例模式
 * 这个模式将同步类容下方到if内部，提高了执行效率，不必每次获取对象时都同步，只有第一次才同步，创建以后就没必要了
 * 问题：由于变压器优化问题和JVM底层内部模型原因，偶尔会出现问题，不建议使用
 * @author xujinshan361@163.com
 *
 */
public class SingletonDemo03 {

	private static SingletonDemo03 instance =null;
	
	//双重检查锁
	public static SingletonDemo03 getInstance() {
		if(instance == null) {
			SingletonDemo03 sc;
			synchronized (SingletonDemo03.class) {
				sc = instance;
				if(sc == null) {
					synchronized (SingletonDemo03.class) {
						if(sc == null) {
							sc = new SingletonDemo03();
						}
					}
					instance =sc;
				}
			}
		}
		return instance;
	}
	
	public SingletonDemo03() {
		
	}
}
