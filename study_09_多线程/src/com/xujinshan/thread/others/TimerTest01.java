package com.xujinshan.thread.others;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 任务调度：Timer 和TimerTask类
 * @author xujinshan361@163.com
 *
 */
public class TimerTest01 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		//执行安排
		//timer.schedule(new MyTask(), 1000);  //执行任务一次
		//timer.schedule(new MyTask(), 1000,200); //执行多次
		Calendar cal = new GregorianCalendar(2099999,12,31,21,53,54);
		timer.schedule(new MyTask(), cal.getTime(),200); //指定时间
	}

}
//任务类
class  MyTask extends TimerTask{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("放空大脑休息一会");
		}
		System.out.println("------end-------");
	}
	
}
