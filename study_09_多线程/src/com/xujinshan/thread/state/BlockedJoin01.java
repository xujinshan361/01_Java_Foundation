package com.xujinshan.thread.state;

/**
 * join:合并线程，插队线程
 * 
 * join合并线程，待此线程执行完成后，在执行其他线程，其他线程阻塞
 * @author xujinshan361@163.com
 *
 */
public class BlockedJoin01 {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(()->{
			for(int i=0;i<100;i++) {
				System.out.println("lambda..."+i);
			}
		});
		t.start();
		
		for(int i=0;i<100;i++) {
			if(i==20) {
				t.join(); //插队，main 主线程被阻塞
			}
			System.out.println("main"+i);
		}
	}
}
