package com.xujinshan.io.test01;

import java.io.File;
import java.io.IOException;
/**
 * 其他信息
 * createNewFile(): 不存在才创建，存在创建成功
 * delete(): 删除已经存在的文件
 * @author xujinshan361@163.com
 *
 */
public class FileDemo06 {
	public static void main(String[] args) throws IOException {
		File src = new File("E:\\java\\01_java基础\\study_08_IO流技术\\IO.png");
		boolean flag =src.createNewFile();
		System.out.println(flag);
		flag = src.delete();
		System.out.println(flag);
		
		System.out.println("----------");
		//不是文件夹
		src = new File("E:/java/io"); //写的目录是文件夹，但是创建的还是文件，没有后缀名
		flag =src.createNewFile();
		System.out.println(flag);
		
		flag = src.delete();
		System.out.println(flag);
		
		
		//补充:  con com3... 操作系统的设备名，不能正确创建
		src = new File("E:/java/IO/test/con");
		src.createNewFile();
	}
}
