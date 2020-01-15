package com.xujinshan.io.test01;

import java.io.File;

/**
 * 其他信息
 * length(): 文件的字节数
 * @author xujinshan361@163.com
 *
 */
public class FileDemo05 {
	public static void main(String[] args) {
		File src = new File("IO.png");
		System.out.println(src.getAbsolutePath());          
		System.out.println("长度:"+ src.length());           //文件路径中存在中文，可能获取不到文件的长度
		
		src = new File("study_08_IO流技术");    //只能获取文件的大小，如果是文件夹则返回0
		System.out.println("长度:"+ src.length());
		
		src = new File("E:/java");
		System.out.println(src.getAbsolutePath());
		System.out.println("长度:"+ src.length());
		
		
	}
}
