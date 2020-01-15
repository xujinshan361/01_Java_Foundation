package com.xujinshan.opp;
/**
 * 测试非静态内部类
 * @author xujinshan361@163.com
 *
 */
public class TestInnerClass {
	public static void main(String[] args) {
		
		//创建内部类对象
		Outer.Inner  inner = new Outer().new Inner();
		
		inner.show();
		
	}
}

class Outer {
	private int  age = 10;
	
	public  void  testOuter(){
		System.out.println("Outer.testOuter()");
	}
	
	class  Inner {
		int  age = 20;
		public  void  show(){
			int age = 30;
			System.out.println("外部成员的变量age:"+Outer.this.age); 
			System.out.println("内部成员的变量age:"+this.age); 
			System.out.println("局部变量age:"+age); 
		}
	}
	
	
}
