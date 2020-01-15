package com.xujinshan.io.test02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 文件拷贝：文件字节输入输入流
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.关闭流
 * @author xujinshan361@163.com
 *
 */
public class Copy {

	public static void main(String[] args) {
		copy("src/com/xujinshan/io/test02/Copy.java","copy.txt");
	}
	/**
	 * 文件的拷贝 
	 * 思考: 利用递归 制作文件夹的拷贝
	 * @param srcPath
	 * @param destPath
	 */
	public static void copy(String srcPath,String destPath) {
		//1、创建源
			File src = new File(srcPath); //源头
			File dest = new File(destPath);//目的地
			//2、选择流
			InputStream  is =null;
			OutputStream os =null;
			try {
				is =new FileInputStream(src);
				os = new FileOutputStream(dest);		
				//3、操作 (分段读取)
				byte[] flush = new byte[1024]; //缓冲容器
				int len = -1; //接收长度
				while((len=is.read(flush))!=-1) {
					os.write(flush,0,len); //分段写出
				}			
				os.flush();
			}catch(FileNotFoundException e) {		
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}finally{
				//4、释放资源 分别关闭 先打开的后关闭
				try {
					if (null != os) {
						os.close();
					} 
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				try {
					if(null!=is) {
						is.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	}
	
	/**
	 * 使用try-with-resource释放资源
	 * @param srcPath
	 * @param destPath
	 */
	public static void copy2(String srcPath,String destPath) {
		//1、创建源
			File src = new File(srcPath); //源头
			File dest = new File(destPath);//目的地
			//2、选择流		
			try(InputStream  is=new FileInputStream(src);
					OutputStream os = new FileOutputStream(dest);	) {	  //自动释放资源，不需要finally			
				//3、操作 (分段读取)
				byte[] flush = new byte[1024]; //缓冲容器
				int len = -1; //接收长度
				while((len=is.read(flush))!=-1) {
					os.write(flush,0,len); //分段写出
				}			
				os.flush();
			}catch(FileNotFoundException e) {		
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
}
