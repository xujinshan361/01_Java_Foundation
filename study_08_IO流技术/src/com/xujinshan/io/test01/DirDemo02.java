package com.xujinshan.io.test01;

import java.io.File;

/**
 * 列出下一级
 * 1.list(): 列出下级名称
 * 2.listFiles():列出下级file对象
 * 
 * 列出所有的盘符:listRoots()
 * @author xujinshan361@163.com
 *
 */
public class DirDemo02 {
	public static void main(String[] args) {
		File dir = new File("D:/java/io/test");
		
//		//下级名称  list
//		String[] subNames = dir.list();
//		for(String s:subNames) {
//			System.out.println(s);
//		}
//		
//		//下级对象  listFiles()
//		File[] subFiles = dir.listFiles();
//		for(File s:subFiles) {
//			System.out.println(s.getAbsolutePath());
//		}
//		
		//所有盘符
		File[] roots = dir.listRoots();//输出所有盘符
		for(File r:roots) {
			System.out.println(r.getAbsolutePath());
		}
	}
}
