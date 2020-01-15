package com.xujinshan.thread.state;

/**
 * yield 礼让线程暂停线程， 直接进入就绪状态，不是阻塞状态
 * @author xujinshan361@163.com
 *
 */
public class YieldDemo01 {
	
	public static void main(String[] args) {
		MyYield my = new MyYield();
		new Thread(my,"线程a").start();
		new Thread(my,"线程b").start();
	}
}

class MyYield implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"-->start");
		Thread.yield();  //礼让 
		System.out.println(Thread.currentThread().getName()+"-->end");
	}
}