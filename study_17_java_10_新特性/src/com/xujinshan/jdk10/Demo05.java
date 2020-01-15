package com.xujinshan.jdk10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Reader:transferTo方法
 * @author xujinshan361@163.com
 *
 */
public class Demo05 {

	public static void main(String[] args) throws Exception{
		var reader = new BufferedReader(new InputStreamReader(new FileInputStream("d:/aa.txt"), "gbk"));
		var p = new PrintWriter(new File("d:/cc.txt"));
		reader.transferTo(p);
		p.flush();
		p.close();
		reader.close();
	}
}
