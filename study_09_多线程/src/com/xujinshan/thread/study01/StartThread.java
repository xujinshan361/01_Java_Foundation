package com.xujinshan.thread.study01;

/**
 * 创建线程方式一：
 * 1.创建：继承Thread 类 +重写run
 * 2.启动：创建子类对象+start
 * @author xujinshan361@163.com
 *
 */
public class StartThread extends Thread{
	/**
	 * 线程入口点
	 */
	@Override
	public void run() {
		for(int i=0;i<40;i++) {
			System.out.println("一边听歌");
		}
	}
	public static void main(String[] args) {			
		//创建子类对象
		StartThread st =new StartThread();
		//启动 
		st.start(); //不保证立即运行 cpu调用
		//st.run(); //普通方法调用
		for(int i=0;i<40;i++) {
			System.out.println("一边coding");
		}
	}
}
