package com.xujinshan.io.test03;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *打印流PrintStream
 * @author xujinshan361@163.com
 *
 */
public class PrintTest01 {

	public static void main(String[] args) throws FileNotFoundException {
		//打印流System.out
		PrintStream ps = System.out;
		ps.println("打印流");
		ps.print(true);
		
		ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")));
		ps.println("打印流");
		ps.print(true);
		ps.flush();
		ps.close();
		//重定向输出端
		System.setOut(ps);
		System.out.println("change");
		
		//重定向回控制台
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));
		System.out.println("回控制台");
	}
}
