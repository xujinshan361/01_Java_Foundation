package com.xujinshan.mypro01;
/**
 * 小球游戏
 */
import  java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
	
	Image ball = Toolkit.getDefaultToolkit().getImage("src/images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("src/images/desk.jpg");
	
	double  x=100;	//小球的横坐标
	double  y=100; //小球的纵坐标
	//画窗口的方法
	public void paint(Graphics g){
		System.out.println("窗口被画了一次");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
	}
	
	//窗口加载
	void launchFrame(){
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
	}
	//main方法是程序执行的入口
	public static void main(String[] args){
		System.out.println("飞机游戏");
		BallGame game = new BallGame();
		game.launchFrame();
	}
	
}
