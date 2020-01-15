package com.xujinshan.mypro02;
/**
 * 测试运算符
 * @author xujinshan361@163.com
 *
 */
public class TestOperator01 {
	public static void main(String[] args) {
	/*	
		byte  a = 1;
		int     b = 2;
		long  b2 = 3;
	//	byte  c = a+b;				//报错
	//	int    c2 = b2+b;			//报错
		
		float  f1 = 3.14F;
		float  d =   b+b2;
		
//		float  d2 = f1+ 6.2;		//报错
		
		System.out.println(-9%5);	
*/
		/*
		//测试自增和自减
		int a = 3;
		int b = a++;   //ִ执行完后， b = 3 。先给b赋值，再自增
		System.out.println("a="+a+"\nb="+b);
		a = 3;
		b = ++a;   // 执行完后， b = 5 。先给b自增，赋值
		System.out.println("a="+a+"\nb="+b);
		*/
		
		int a=3;
		int b=4;
		a+=b;//相当于 a = a+b
		System.out.println("a="+a+"\nb="+b);
		a=3;
		a*=b+3;//相当于a=a*(b+3)
		System.out.println("a="+a+"\nb="+b);
		
	}
}
