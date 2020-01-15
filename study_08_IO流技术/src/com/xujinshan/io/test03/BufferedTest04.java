package com.xujinshan.io.test03;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件字符输出流         加入缓冲流
 * 1.创建源
 * 2.选择流
 * 3.操作(写出内容)
 * 4.释放资源
 * @author xujinshan361@163.com
 *
 */
public class BufferedTest04 {

	public static void main(String[] args) {
		//1、创建源
		File dest = new File("dest.txt");
		//2、选择流
		BufferedWriter writer =null;    //不要发生多态
		try {
			writer = new BufferedWriter(new FileWriter(dest));
			//3、操作(写出)			
			writer.append("IO is so easy");
			writer.newLine();
			writer.append("hello ");
			writer.flush();
		}catch(FileNotFoundException e) {		
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			//4、释放资源
			try {
				if (null != writer) {
					writer.close();
				} 
			} catch (Exception e) {
			}
		}
	}

}
