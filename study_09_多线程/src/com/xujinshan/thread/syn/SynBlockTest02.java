package com.xujinshan.thread.syn;

import java.util.ArrayList;
import java.util.List;

/**
 * 线程安全，操作容器
 * @author xujinshan361@163.com
 *
 */
public class SynBlockTest02 {
	public static void main(String[] args) throws InterruptedException {
		List<String> list = new ArrayList<String>();
		for(int i=0;i<10000;i++) {
			new Thread(()->{
				//同步块
				synchronized(list) {
					list.add(Thread.currentThread().getName());
				}
			}) .start();
		}
		Thread.sleep(10000);  //加一个延时等线程执行结束
		System.out.println(list.size());
	}
}

