package com.xujinshan.thread.study01;

/**
 * lambda 推导
 * @author xujinshan361@163.com
 *
 */
public class LambdaTest01 {
	//内部类
	static class Like2 implements ILike{
		public void lambda() {
			System.out.println("i like lambda2 ");
		}
		
	}
	public static void main(String[] args) {
		ILike like = new Like();
		like.lambda();
		
		like = new Like2();
		like.lambda();
		
		
		class Like3 implements ILike{
			public void lambda() {
				System.out.println("i like lambda3 ");
			}
			
		}
		
		like = new Like3();
		like.lambda();
		//匿名内部类
		like = new ILike() {
			public void lambda() {
				System.out.println("i like lambda4 ");
			}
		};
		like.lambda();
		//lambda
		like = ()-> {
			System.out.println("i like lambda5 ");
		};
		like.lambda();
		
		
		/*
		 *lambda推导必须存在类型
		()-> {
			System.out.println("i like lambda5 ");
		}.lambda();
		*/
	}
}
interface ILike{
	void lambda();
}
//外部类
class Like implements ILike{

	@Override
	public void lambda() {
		System.out.println("i like lambda ");
	}
	
}