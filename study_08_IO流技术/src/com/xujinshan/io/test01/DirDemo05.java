package com.xujinshan.io.test01;

import java.io.File;

/**
 * 统计文件的大小
 * @author xujinshan361@163.com
 *
 */
public class DirDemo05 {
	public static void main(String[] args) {
		File src =  new File("E:/java/io/test");
		count(src);
		System.out.println(len);
	}
	private static long len =0;
	public static void count(File src) {	
		//获取大小
		if(null!=src && src.exists()) {
			if(src.isFile()) {  //大小
				len+=src.length();            //记录长度
			}else { //子孙级
				for(File s:src.listFiles()) {
						count(s);
				}
			}
		}
	}
}
