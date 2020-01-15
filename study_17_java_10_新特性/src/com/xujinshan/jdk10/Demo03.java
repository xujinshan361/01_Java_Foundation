package com.xujinshan.jdk10;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/**
 * java.io.ByteArrayOutputStream.toString(Charset)
 * @author xujinshan361@163.com
 *
 */
public class Demo03 {

	public static void main(String[] args) throws Exception {
		String str = "我是中国人";
		ByteArrayInputStream bis = new ByteArrayInputStream(str.getBytes("gbk"));
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		int c = 0;
		while((c = bis.read()) != -1) {
			bos.write(c);
		}
		//bos.toString() 默认的使用的UTF-8编码
		System.out.println(bos.toString());
		System.out.println(bos.toString("gbk"));
	}
}
