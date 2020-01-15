package com.xujinshan.mypro02;
/**
 * 测试位运算
 * @author xujinshan361@163.com
 *
 */
public class TestOperator04 {
	public static void main(String[] args) {
		 int  a = 3;
		 int  b =4;
		 System.out.println(a&b);
		 System.out.println(a|b);
		 System.out.println(a^b);
		 System.out.println(~a);
		 
		 //移位操作
		 int  c = 3<<2;
		 System.out.println(c);
		 System.out.println(12>>1); 
	}
}
