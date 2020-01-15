package com.xujinshan.jdk10;

/**
 * 
 * @author xujinshan361@163.com
 *
 */
public class Demo07 {

	public static void main(String[] args) {
		var str = Runtime.version().feature();
		System.out.println(str);
		System.out.println(Runtime.version().interim());
		System.out.println(Runtime.version().patch());
		System.out.println(Runtime.version().update());
	}
}
