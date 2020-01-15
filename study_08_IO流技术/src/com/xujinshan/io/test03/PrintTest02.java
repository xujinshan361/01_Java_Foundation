package com.xujinshan.io.test03;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * 打印流 PrintWriter
 * @author xujinshan361@163.com
 *
 */
public class PrintTest02 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream("print.txt")));
		pw.println("打印流");
		pw.println(true);
		pw.close();
	}
}
