package com.xujinshan.thread.state;

/**
 * 其他方法
 * isAlive:线程是否还活着
 * Thread.currentThread(): 表示当前线程
 * setName() getName() : 代理名称，如果是真实名称，用面向对象的思想，设置属性      
 * @author xujinshan361@163.com
 *
 */
public class InfoTest {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().isAlive());
		
		//设置名称 ：真实名字+代理名字
		MyInfo info = new MyInfo("战斗机");
		Thread t = new Thread(info);
		t.setName("公鸡");
		t.start();
		Thread.sleep(1000);
		System.out.println(t.isAlive());
	}
}

class MyInfo implements Runnable{
	private String name;
	
	public MyInfo(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"-->"+name);
	}
}