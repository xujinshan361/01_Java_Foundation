package com.xujinshan.opp;

import com.xujinshan.opp.Outer.Inner;

/**
 * 测试静态内部类
 * @author xujinshan361@163.com
 *
 */
public class TestStaticInnerClass {
	public static void main(String[] args) {
		//静态内部类的创建方式
		Outer2.Inner2  inner2 = new Outer2.Inner2(); 
		//创建非静态内部类的方式
//		Outer.Inner  inner = new Outer().new Inner();
	}
}

class Outer2 {
	static class Inner2{
		
	}
	
}

//class Outer{
//	class Inner{
//		
//	}
//}