package com.xujinshan.jdk10;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 * java.util.Scanner
 * @author xujinshan361@163.com
 *
 */
public class Demo06 {

	public static void main(String[] args) throws Exception {
		var scan = new Scanner(new FileInputStream(new File("d:/aa.txt")),"gbk");
		scan.useDelimiter(" |,");
		while(scan.hasNext()) {
			System.out.println(scan.next());
		}
	}

}
