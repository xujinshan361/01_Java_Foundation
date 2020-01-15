package com.xujinshan.io.test01;

import java.io.File;

/**
 * 文件状态
 * 1.不存在：exists
 * 2.存在：	
 * 		文件：isFile
 * 		文件夹：isDirectory
 * @author xujinshan361@163.com
 *
 */
public class FileDemo04 {

	public static void main(String[] args) {
		File src = new File("IO.png");
		System.out.println(src.getAbsolutePath());       //输出绝对路径
		System.out.println("是否存在:"+src.exists());       //判断是否存在
		System.out.println("是否文件:"+src.isFile());       //判断是否是文件
		System.out.println("是否文件夹:"+src.isDirectory()); //判断是否是文件夹
		
		src = new File("IO.png");
		System.out.println("----------");
		System.out.println("是否存在:"+src.exists());
		System.out.println("是否文件:"+src.isFile());
		System.out.println("是否文件夹:"+src.isDirectory());
		
		src = new File("D:\\java\\IO_study01");
		System.out.println("----------");
		System.out.println("是否存在:"+src.exists());
		System.out.println("是否文件:"+src.isFile());
		System.out.println("是否文件夹:"+src.isDirectory());
		
		//文件状态
		src = new File("xxx");
		if(null == src || !src.exists()) {
			System.out.println("文件不存在");
		}else {
			if(src.isFile()) {
				System.out.println("文件操作");
			}else {
				System.out.println("文件夹操作");
			}
		}

		
	}

}
