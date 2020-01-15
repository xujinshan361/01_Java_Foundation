package com.xujinshan.thread.others;

/**
 * volatile用于保证数据的同步，也就是可见性
 *    从工作内存同步到主存
 * @author xujinshan361@163.com
 *
 */
public class VolatileTest {
	private volatile static int num = 0;     //加入了volatile  会及时更新主存的数据
	public static void main(String[] args) throws InterruptedException {
		new Thread(()->{
			while(num==0) { //此处不要编写代码
				
			}
		}) .start();
		
		Thread.sleep(1000);
		num = 1;
	}

}
