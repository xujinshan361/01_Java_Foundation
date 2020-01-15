package com.xujinshan.pattern07.adapter;

/**
 * 适配器
 * 对象适配器方式,使用了组合的方式跟被适配对象整合
 * (相当于usb和ps/2的转接器)
 * @author xujinshan361@163.com
 *
 */
public class Adapter02 implements Target{

	private Adaptee adaptee;       //一个被适配类的对象
	
	@Override
	public void handleReq() {
		adaptee.request();
	}

	public Adapter02(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}
}
