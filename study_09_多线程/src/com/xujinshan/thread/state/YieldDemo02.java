package com.xujinshan.thread.state;

/**
 * yield 礼让线程暂停线程， 直接进入就绪状态，不是阻塞状态
 * 
 * 礼让线程，让当前正在执行线程暂停
 * 不是阻塞线程，而是将线程从运行状态转入就绪状态
 * 让CPU调度器重新调度
 * @author xujinshan361@163.com
 *
 */
public class YieldDemo02 {

	public static void main(String[] args) {
		new Thread(()-> {
			for(int i=0;i<100;i++) {
				System.out.println("lambda..."+i);
			}
		}).start();
		
		for(int i=0;i<100;i++) {
			if(i%20==0) {
				Thread.yield();    //main礼让
			}
			System.out.println("main...."+i);
		}
	}
}
