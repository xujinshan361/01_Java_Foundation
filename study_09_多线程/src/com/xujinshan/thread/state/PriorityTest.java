package com.xujinshan.thread.state;

/**
 * 线程的优先级
 * 
 * Java提供一个线程调度器来监控程序中启动后进入就绪状态的所有线程，线程调度器按照线程的优先级决定应调度哪个线程来执行
 * 线程的优先级用数字表示，范围为1-10
 * Thread.MIN_PRIORITY = 1
 * Thread.MAX_PRIORITY =10
 * Thread.NORM_PRIORITY=5   默认
 * 
 * 使用下述方法获得或设置线程对象的优先级
 * int getPriority
 * void setPriority(int newPriority)
 * @author xujinshan361@163.com
 *
 */
public class PriorityTest {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		
		MyPriority mp = new MyPriority();
		Thread t1 = new Thread(mp);
		Thread t2 = new Thread(mp);
		Thread t3 = new Thread(mp);
		Thread t4 = new Thread(mp);
		Thread t5 = new Thread(mp);
		Thread t6 = new Thread(mp);
		//设置优先级在启动之前
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
		t5.setPriority(Thread.MIN_PRIORITY);
		t6.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}

class MyPriority implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"-->"+Thread.currentThread().getPriority());
		Thread.yield();  //礼让
	}
}