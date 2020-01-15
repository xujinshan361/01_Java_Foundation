package com.xujinshan.mypro02;
/**
 * 测试自动类型转换
 * @author xujinshan361@163.com
 *
 */
public class TestTypeConvert {
	public static void main(String[] args) {
		int  a = 324;
		long  b = a;
		double  d = b;
//		a = b;     
//		long  e = 3.23F;
		float  f = 234324L;
		
		//特例
		byte  b2 = 123;
		
	}
}
