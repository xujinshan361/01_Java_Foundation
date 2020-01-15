package com.xujinshan.mypro03;
/**
 * 测试while 循环
 * @author xujinshan361@163.com
 *
 */
public class TestWhile {
	public static void main(String[] args) {
		//计算1+2+3+···+100累加和
		//暴力
		int  sum = 0;
		
		int   i = 1;
		while(i<=100){
			 sum  =  sum  + i;
			i++;
		}
		
		/*
		 * 1.执行初始化语句：i=1
		 * 2.判断i<=100
		 * 3.执行循环体
		 * 4.迭代：i++
		 * 5.回到第二步继续判断
		 */
		System.out.println(sum);
		
	}
}
