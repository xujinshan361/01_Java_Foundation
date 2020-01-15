package com.xujinshan.pattern07.adapter;

/**
 * 客户端类
 * (相当于例子中的笔记本，只有USB接口)
 * @author xujinshan361@163.com
 *
 */
public class Client {

	public void test1(Target t) {
		t.handleReq();
	}
	
	public static void main(String[] args) {
		Client c = new Client();
		Adaptee a = new Adaptee();
		
		Target t = new Adapter();
//		Targer t = new Adapter02(a);
		c.test1(t);
	}
}
