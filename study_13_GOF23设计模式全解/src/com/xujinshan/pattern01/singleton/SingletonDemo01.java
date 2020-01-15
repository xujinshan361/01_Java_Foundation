package com.xujinshan.pattern01.singleton;

/**
 * 测试饿汉式单例模式
 * @author xujinshan361@163.com
 *
 */
public class SingletonDemo01 {

	//类初始化时，立即加载这个对象，(没有延时加载的优势)，加载类时，天然的线程安全的(static 同步)
	private static SingletonDemo01 instance = new  SingletonDemo01();
	//构造器私有化
	private SingletonDemo01() {
		
	}
	//方法没有同步，调用效率高
	public static SingletonDemo01 getInstance() {
		return instance;
	}
}
