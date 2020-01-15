package com.xujinshan.thread.study01;

/**
 * 共享资源，并发(线程安全)
 * @author xujinshan361@163.com
 *
 */
public class Web12306 implements Runnable{
	//票数
	private int ticketNums = 99;
	
	@Override
	public void run() {
		while(true) {
			if(ticketNums<0) {
				break;
			}
			try {   //run方法不能往外抛异常
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);
		}
	}
	public static void main(String[] args) {
		//一份资源
		Web12306 web =new Web12306();
		System.out.println(Thread.currentThread().getName());
		//多个代理
		new Thread(web,"码畜").start();
		new Thread(web,"码农").start();
		new Thread(web,"码蟥").start();;
	}
}
