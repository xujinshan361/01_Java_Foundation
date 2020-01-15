package com.xujinshan.test;

import java.util.Date;
/**
 * 测试Date类的常见用法
 * @author xujinshan361@163.com
 *
 */
public class TestDate {
	public static void main(String[] args) {
		Date  d = new Date(2000);
		System.out.println(d);
		
		System.out.println(d.getTime()); 
		
		Date d2 = new Date();
		System.out.println(d2.getTime());
		
		System.out.println(d2.after(d)); 
		
		
		//以后遇到日期处理，使用Canlendar日期类
		Date d3 = new Date(2020-1900,3,10);		//2020年4月10日
		System.out.println(d3);
		
		
		
	}
}
