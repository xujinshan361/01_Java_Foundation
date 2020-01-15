package com.xujinshan.jdk10;

import java.io.PrintWriter;

/**
 * java.io.PrintStream、java.io.PrintlWriter新增构造方法
 * @author xujinshan361@163.com
 *
 */
public class Demo04 {

	public static void main(String[] args) throws Exception{
		String str = "中是中国人";
		var p = new PrintWriter("d:/aa.txt", "gbk");
		p.println(str);
		p.flush();
		p.close();
	}

}
