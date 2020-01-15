package com.xujinshan.io.test03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

/**
 * 转换流： InputStreamReader     OutputStreamWriter
 * 1.以字符流的形式操作字节流(纯文本)
 * 2.指定字符集
 * @author xujinshan361@163.com
 *
 */
public class ConvertTest02 {
	public static void main(String[] args) {
		try(BufferedReader reader =
				new BufferedReader(
						new InputStreamReader(
								new URL("http://www.baidu.com").openStream(),"UTF-8"));
				BufferedWriter writer =
						new BufferedWriter(
								new OutputStreamWriter(
										new Fil