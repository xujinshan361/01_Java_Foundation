package com.xujinshan.io.test01;

import java.io.File;

/**
 * 
 * @author xujinshan361@163.com
 *
 */
public class FileDemo01 {
	/**
	 * 构建File对象
	 * @param args
	 */
	public static void main(String[] args) {
		String path ="E:\\java\\01_java基础\\study_08_IO流技术\\IO.png";
		
		//1、构建File对象
		File src = new File(path);
		System.out.println(src.length());
		
		//2、构建File对象
		src = new File("E:\\java\\01_java基础\\study_08_IO流技术","IO.png");
		src = new File("E:\\java\\01_java基础","study_08_IO流技术/IO.png");
		System.out.println(src.length());
		
		//3、构建File对象
		src = new File(new File("E:\\java\\01_java基础\\study_08_IO流技术"),"IO.png");
		System.out.println(src.length());
	}

}
