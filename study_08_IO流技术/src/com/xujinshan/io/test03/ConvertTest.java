package com.xujinshan.io.test03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 转换流 ：InputStreamReader   OutputStreamWriter
 * 将字节流转换成字符流
 * @author xujinshan361@163.com
 *
 */
public class ConvertTest {
	public static void main(String[] args) {
		//操作System.in 和System.out
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer =new BufferedWriter(new OutputStreamWriter(System.out));){
			//循环获取键盘的输入(exit退出)，输出此内容
			String msg ="";
			while(!msg.equals("exit")) {
				msg = reader.readLine(); //循环读取
				writer.write(msg); //循环写出
				writer.newLine();
				writer.flush(); //强制刷新
			}
		}catch(IOException e) {
			System.out.println("操作异常");
		}
		
		
	}
}
