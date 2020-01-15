package com.xujinshan.opp;
/**
 * 测试字符串的基本用法
 * @author xujinshan361@163.com
 *
 */
public class TestString {
	public static void main(String[] args) {
		String  str = "abc";
		String str2 = new String("def");
		String str3 = "abc"+"defgh";
		String str4 = "18"+19;			//不是加法，是字符串连接符
		System.out.println(str4);
		
		System.out.println("##############");
		String  str10 = "张三";
		String  str11 = "张三";
		String  str12 = new String("张三");
		
		
		System.out.println(str10 == str11);     //是同一个对象
		System.out.println(str12 == str11);		//str12 和str11 不是同一个对象
		
		
		//ͨ通常比较字符串时，使用equals
		System.out.println(str12.equals(str11));
		
		
		
		
	}
}
