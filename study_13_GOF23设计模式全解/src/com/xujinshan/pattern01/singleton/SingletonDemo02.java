package com.xujinshan.pattern01.singleton;

/**
 * 测试懒汉式单例模式
 * @author xujinshan361@163.com
 *
 */
public class SingletonDemo02 {

	//类初始化时，不初始化这个对象，(延时加载，真正使用的时候再加载)
	private static SingletonDemo02 instance;
	
	//私有化构造器
	private SingletonDemo02() {
		
	}
	
	//方法同步，调用效率低(防止多个线程，如果不使用同步，多个线程可能创建多个对象)
	public static synchronized SingletonDemo02 getInstance() {
		if(instance!=null) {
			instance = new SingletonDemo02();
		}
		return instance;
	}
}
