package com.xujinshan.pattern01.singleton;

/**
 * 测试单例模式
 * @author xujinshan361@163.com
 *
 */
public class Client01 {

	public static void main(String[] args) {
		SingletonDemo04 s1 =SingletonDemo04.getInstance();
		SingletonDemo04 s2 =SingletonDemo04.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(SingletonDemo05.INSTANCE == SingletonDemo05.INSTANCE);
	}
}
