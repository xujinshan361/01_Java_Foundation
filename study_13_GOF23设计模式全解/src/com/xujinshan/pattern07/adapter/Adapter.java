package com.xujinshan.pattern07.adapter;

/**
 * 适配器(类适配方式)
 * (相当于usb和ps/2的转接器)
 * @author xujinshan361@163.com
 *
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void handleReq() {
		super.request();
	}
	
}
