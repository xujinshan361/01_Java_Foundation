package com.xujinshan.thread.state;

import com.xujinshan.thread.study01.Web12306;

/**
 * sleep(时间)  指定当前线程阻塞的毫秒数
 * sleep 存在异常 InterruptedException
 * sleep时间到达后线程进入就绪状态
 * sleep可以模拟网络延时、倒计时等
 * 每一个对象都有一个锁，sleep不会释放锁
 * 模拟网络延时，放大了发生问题的可能性
 * @author xujinshan361@163.com
 *
 */
public class BlockedSleep01 implements Runnable {
	//票数
		private int ticketNums = 99;
		
		@Override
		public void run() {
			while(true) {
				if(ticketNums<0) {
					break;
				}
				try {   //run方法不能往外抛异常
					Thread.sleep(200);   //加入网络延时，放大发生错误的可能性
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
