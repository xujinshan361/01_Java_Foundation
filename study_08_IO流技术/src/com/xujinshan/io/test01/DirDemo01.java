package com.xujinshan.io.test01;

import java.io.File;

/**
 * 创建目录
 * 1.mkdir() :确保上级目录存在，不存在创建失败
 * 2.mkdirs():上级目录可以不存在，不存在一同创建
 * @author xujinshan361@163.com
 *
 */
public class DirDemo01 {
	public static void main(String[] args) {
		File dir = new File("D:/java/io/test");
		//创建目录 mkdirs()推荐使用
		boolean flag = dir.mkdirs();
		System.out.println(flag);
		//创建目录 mkdir()
		dir = new File("D:/java/io_test");
		flag = dir.mkdirs();
		System.out.println(flag);
	}
}
