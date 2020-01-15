package com.xujinshan.io.test01;

import java.io.File;

/**
 * 递归：方法自己调用自己
 * 打印子孙级目录和文件的名称
 * @author xujinshan361@163.com
 *
 */
public class DirDemo04 {
	public static void main(String[] args) {
		File src =  new File("E:/java/io/test");
		printName(src,0);
	}
	//打印打印子孙级目录和文件的名称
	public static void printName(File src,int deep) {
		//控制前面层次
		for(int i=0;i<deep;i++) {
			System.out.print("-");
		}
		//打印名称
		System.out.println(src.getName());	
		if(null ==src || !src.exists()) {  //递归头
			return ;
		}else if(src.isDirectory()) { //目录
			for(File s:src.listFiles()) {
				printName(s,deep+1); //递归体
			}
		}
	}
}
