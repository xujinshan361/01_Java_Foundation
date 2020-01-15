package com.xujinshan.thread.others;

/**
 * InheritableThreadLocal :继承上下文环境，拷贝一份子线程
 * @author xujinshan361@163.com
 *
 */
public class ThreadLocalTest04 {	
	private static ThreadLocal<Integer> threadLocal = new InheritableThreadLocal<>();
	public static void main(String[] args) {
		threadLocal.set(2);
		System.out.println(Thread.currentThread().getName()+"-->"+threadLocal.get());	
		
		//线程由main线程开辟
		new Thread(()->{
			System.out.println(Thread.currentThread().getName()+"-->"+threadLocal.get());	
			threadLocal.set(200);
			System.out.println(Thread.currentThread().getName()+"-->"+threadLocal.get());	
		}) .start();
		
	}	
	
	
}
