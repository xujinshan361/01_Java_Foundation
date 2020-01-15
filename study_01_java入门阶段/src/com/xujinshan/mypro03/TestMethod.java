package com.xujinshan.mypro03;
/**
 * 测试方法的基本用法
 * @author xujinshan361@163.com
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		//ͨ通过对象调用普通方法
		TestMethod   tm  = new TestMethod();
		tm.printStu();
		int c = tm.add(30, 40, 50)+1000;
		System.out.println(c); 
	}
	
	void  printStu(){
		System.out.println("张三");
		System.out.println("李四");
		System.out.println("王五");
	}
	
	int  add(int a, int b, int c){
		int  sum =  a+b+c;
		System.out.println(sum);
		return  sum;			//return 俩个作用：1.结束方法的运行 2.返回值ֵ
	}
	
}
