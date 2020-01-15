package com.xujinshan.io.test01;

import java.io.File;

/**
 * 
 * @author xujinshan361@163.com
 *
 */
public class FileDemo02 {
	/**
	 * 构建File对象
	 * 相对路径与绝对路径
	 * 1)、存在盘符: 绝对路径
	 * 2)、不存在盘符:相对路径  ,当前目录 user.dir
	 * @param args
	 */
	public static void main(String[] args) {
		String path ="E:\\java\\01_java基础\\study_08_IO流技术\\IO.png";
		
		//绝对路径
		File src = new File(path);
		System.out.println(src.getAbsolutePath());      //获取绝对路径
		
		//相对路径
		//System.getProperty("user.dir")项目目录
		System.out.println(System.getProperty("user.dir"));
		src = new File("IO.png");
		System.out.println(src.getAbsolutePath());
		
		
		//构建一个不存在的文件
		src = new File("aaa/IO2.png");
		System.out.println(src.getAbsolutePath());
	}

}
