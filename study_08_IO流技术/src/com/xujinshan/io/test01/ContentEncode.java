package com.xujinshan.io.test01;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 编码： 字符串--> 字节
 * 编码是为了获得字节数组
 * @author xujinshan361@163.com
 *
 */
public class ContentEncode {

	public static void main(String[] args) throws IOException {
		String msg ="性命生命使命a";
		//编码: 字节数组
		byte[] datas = msg.getBytes();  //默认使用工程的字符集(utf-8)
		//utf-8  一个汉字三个字节，英文字母一个字节 
		System.out.println(datas.length);
		
		//编码: 其他字符集
		datas = msg.getBytes("UTF-16LE");
		System.out.println(datas.length);
		
		datas = msg.getBytes("GBK");
		//GBK 中文俩个字节，英文一个字节
		System.out.println(datas.length);				
	}
}
