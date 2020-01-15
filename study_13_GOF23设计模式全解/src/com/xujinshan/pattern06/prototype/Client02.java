package com.xujinshan.pattern06.prototype;

import java.util.Date;

/**
 * 原型模式(深复制)
 * @author xujinshan361@163.com
 *
 */
public class Client02 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(12312321331L);
		Sheep02 s1 = new Sheep02("少利",date);
		Sheep02 s2 = (Sheep02) s1.clone();   //实现深复制。s2对象的birthday是一个新对象！
		
		
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		date.setTime(23432432423L);
		
		System.out.println(s1.getBirthday());
		
		
		s2.setSname("多利");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}
}
