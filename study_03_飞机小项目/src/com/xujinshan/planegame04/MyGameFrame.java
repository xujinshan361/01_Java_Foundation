package com.xujinshan.planegame04;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
/**
 * 飞机游戏的主窗口
 * @author xujinshan361@163.com
 *
 */
public class MyGameFrame  extends  JFrame {
	
	Image   planeImg  = GameUtil.getImage("images/plane.png");
	Image   bg  = GameUtil.getImage("images/bg.jpg");
	
	Plane   plane = new Plane(planeImg,250,250);
	Plane   plane2 = new Plane(planeImg,350,250);
	Plane   plane3 = new Plane(planeImg,450,250);
	
	@Override
	public void paint(Graphics g) {		//自动调用，g相当于一只画笔
		
		g.drawImage(bg, 0, 0, null);
		
		plane.drawSelf(g);  //画飞机
		plane2.drawSelf(g);  //画飞机
		plane3.drawSelf(g);  //画飞机
		
	}
	
	
	//帮助我们反复画窗口
	class  PaintThread  extends  Thread  {
		@Override
		public void run() {
			while(true){
				repaint();		//重画
				
				try {
					Thread.sleep(40);   	//1s=1000ms
				} catch (InterruptedException e) {
					e.printStackTrace();
				}		
			}
		}
		
	}
	
	
	/**
	 * 初始化窗口
	 */
	public  void  launchFrame(){
		this.setTitle("飞机游戏");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(300, 300);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		new PaintThread().start();	//启动重画窗口的线程
		
	}
	
	public static void main(String[] args) {
		MyGameFrame  f = new MyGameFrame();
		f.launchFrame();
	}
	
}
