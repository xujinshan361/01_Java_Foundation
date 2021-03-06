package com.xujinshan.thread.state;

/**
 * sleep模拟休息，和时间相关
 * 模拟龟兔赛跑
 * @author xujinshan361@163.com
 *
 */
public class BlockedSleep02 implements Runnable{
	private  String winner;//胜利者
	@Override
	public void run() {
		for(int steps =1;steps<=100;steps++) {		
			//模拟休息
			if(Thread.currentThread().getName().equals("rabbit") && steps%10==0) {
				try {
					Thread.sleep(100);     //加入延时(静态方法)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"-->"+steps);
			//比赛是否结束
			boolean flag = gameOver(steps);
			if(flag) {
				break;
			}
		}
	}
	private boolean gameOver(int steps) {
		if(winner!=null) { //存在胜利者
			return true;
		}else {
			if(steps ==100) {
				winner = Thread.currentThread().getName();
				System.out.println("winner==>"+winner);
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		BlockedSleep02 racer = new BlockedSleep02();
		new Thread(racer,"tortoise").start();
		new Thread(racer,"rabbit").start();
	}
}
