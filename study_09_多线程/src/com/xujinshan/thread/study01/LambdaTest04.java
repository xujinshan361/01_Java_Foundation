package com.xujinshan.thread.study01;
/**
 * lambda  推导
 * @author xujinshan361@163.com
 *
 */
public class LambdaTest04 {
	
	public static void main(String[] args) {
		new Thread(()->{
			for(int i=0;i<100;i++) {
				System.out.println("一边学习lambda");
			}
		}) .start();
		
		new Thread(()->	System.out.println("一边学习奔溃")) .start();
	}
}