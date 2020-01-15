package com.xujinshan.regex.test;

import java.util.Arrays;

/**
 * 测试正则表达式对象的分割字符串的操作
 * @author xujinshan361@163.com
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		String str = "a232b4334c3434";
		String[] arrs = str.split("\\d+");
		System.out.println(Arrays.toString(arrs));
	}
}
