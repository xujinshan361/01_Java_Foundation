package com.xujinshan.thread.study01;

/**
 * lambda 推导+参数+返回值
 * @author xujinshan361@163.com
 *
 */
public class LambdaTest03 {
	
	public static void main(String[] args) {
		IInterest interest = (int a,int c)-> {
			System.out.println("i like lambda -->"+(a+c));
			return a+c;
		};
		interest.lambda(100,200);
		
		interest = (a,c)-> {
			System.out.println("i like lambda -->"+(a+c));
			return a+c;
		};
		
		interest.lambda(200,200);
		
		interest = (a,c)-> {
			return a+c;
		};
		
		interest = (a,c)-> a+c; //一行代码，return也可以省略
		
		interest = (a,c)-> 100;
		
		System.out.println(interest.lambda(10, 20));
	}
}
interface IInterest{
	int lambda(int a,int b);
}
//外部类
class Interest implements IInterest{

	@Override
	public int lambda(int a,int c) {
		System.out.println("i like lambda -->"+(a+c));
		return a+c;
	}
	
}