package com.xujinshan.thread.syn;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

/**
 * 线程安全：操作并发容器
 * 将List换成CopyOnWriteArrayList 这个类自带锁
 * @author xujinshan361@163.com
 *
 */
public class SynContainer {
	public static void main(String[] args) throws InterruptedException {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		for(int i=0;i<10000;i++) {
			new Thread(()->{
				list.add(Thread.currentThread().getName());
			}) .start();
		}
		Thread.sleep(10000);
		System.out.println(list.size());
	}
}

