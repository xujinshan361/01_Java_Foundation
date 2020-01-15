package com.xujinshan.pattern06.prototype;

import java.util.Date;

/**
原型模式：
	通过new产生一个对象，需要非常繁琐的数据准备或访问权限，则可以使用原型模式
	就是java中的克隆技术，以某个对象为原型，复制出新的对象，显然，新的对象具备原型对象的特点
	优势有：效率高(直接克隆，避免了重新执行构造过程步骤)
	克隆类似于new，但是不同于new，new创建的对象的属性采用的是默认值，克隆出来的对象属性值完全和原型对象相同，并且克隆出新对象不会影响(深复制)新对象，然后在修改新对象的值
 */
/**
 * 测试原型模式(浅克隆)
 * 原型模式实现：
 * 		Cloneable接口和clone方法
 * 		
 * @author xujinshan361@163.com
 *
 */
public class Client01 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(213241241234L);
		Sheep01 s1 = new Sheep01("少利", date);
		
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		date.setDate(12321);          //这个地方会修改s1的对象值
		System.out.println(s1.getBirthday());
		
		Sheep01 s2 =(Sheep01)s1.clone();
		s2.setSname("多利");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}
}
