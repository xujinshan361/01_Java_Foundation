package com.xujinshan.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * try-catch 处理异常
 * @author xujinshan361@163.com
 *
 */
public class Test02 {
	public static void main(String[] args) {
		readMyFile();
	}
	
	public  static  void  readMyFile(){
		FileReader  reader = null;
		try{
			reader = new FileReader("d:/b.txt");
			System.out.println("step1");
			char  c1 = (char)reader.read();
			System.out.println(c1);
			
		}catch(FileNotFoundException e){		//子类异常在父类异常前面
			System.out.println("step2");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			System.out.println("step3");
			try {
				if(reader!=null){
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
