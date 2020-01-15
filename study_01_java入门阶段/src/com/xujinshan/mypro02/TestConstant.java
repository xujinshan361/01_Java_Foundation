package com.xujinshan.mypro02;
/**
 * 测试常量
 * @author xujinshan361@163.com
 *
 */
public class TestConstant {
	public static void main(String[] args) {
		int age = 18;
		
		final  String NAME = "张三";     //final 定义的是常量，值不能修改
		
		final double PI = 3.14;
        // PI = 3.15; //编译错误，不能被再赋值！
        double r = 4;
        double area = PI * r * r;
        double circle = 2 * PI * r;
        System.out.println("area = " + area);
        System.out.println("circle = " + circle);
        
	}
}
