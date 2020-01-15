package com.xujinshan.pattern01.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试多线程环境下五种创建单例模式的效率
 * CountDownLatch 
 * 同步辅助类，在完成一组正在其他线程中执行的操作之前，它允许一个或多个线程一直等待。
 * countDown()：当前线程调此方法，则计数器减一(建议放在finally里面执行)
 * await():调此方法会一直阻塞当前线程，直到计数器为0
 * @author xujinshan361@163.com
 *
 */
public class Client03 {
	
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch  countDownLatch = new CountDownLatch(threadNum);
		
		for(int i=0;i<threadNum;i++){
			new Thread(new Runnable() {
				@Override
				public void run() {
					
					for(int i=0;i<1000000;i++){
//						Object o = SingletonDemo04.getInstance();
						Object o = SingletonDemo05.INSTANCE;
					}
					
					countDownLatch.countDown();
				}
			}).start();
		}
		
		countDownLatch.await();	//main线程阻塞，直到计数器变为0，才会继续往下执行！
		
		long end = System.currentTimeMillis();
		System.out.println("总耗时："+(end-start));
	}
}
