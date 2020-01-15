package com.xujinshan.io.test01;

import java.io.File;

/**
 * 
 * @author xujinshan361@163.com
 *
 */
public class PathDemo01 {
	/**
	 *  \  /  名称分隔符  separator
	 * @param args
	 */
	public static void main(String[] args) {
		String path ="E:\\java\\01_java基础\\study_08_IO流技术\\IO.png";
		System.out.println(File.separatorChar);		
		//建议
		//1、/
		path = "E:/java/01_java基础/study_08_IO流技术/IO.png";
		System.out.println(path);
		//2、常量拼接
		path ="E:"+File.separator+"java"+File.separator+"01_java基础"+File.separator+"study_08_IO流技术"
		+File.separator+"IO.png";
		System.out.println(path);
	}

}
