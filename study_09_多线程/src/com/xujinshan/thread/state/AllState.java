package com.xujinshan.thread.state;

import java.lang.Thread.State;

/**
 * 观察线程的状态
 * @author xujinshan361@163.com
 *
 */
public class AllState {

	public static void main(String[] args) {
		Thread t = new Thread(()-> {
			for(int i=0;i<5;i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(".......");
			}
		});
		
		//观察状态
		State state = t.getState();
		System.out.println(state);      //NEW
		
		t.start();
		state = t.getState();
		System.out.println(state);    //RUNNABLE
//		while(state != Thread.State.TERMINATED) {
//			
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			state = t.getState();
//			System.out.println(state);    //TIMED_WAITING
//		}
//		state = t.getState();
//		System.out.println(state);    //TERMINATED
		
		
		while(true) {
			int num = Thread.activeCount(); //获取活动线程数
			System.out.println(num);
			if(num==1){
				break;
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			state = t.getState();
			System.out.println(state);    //TIMED_WAITING
		}
		state = t.getState();
		System.out.println(state);    //TERMINATED
	}
}
