package com.xujinshan.io.test03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 文件拷贝：文件字节输入、输出流
 * @author xujinshan361@163.com
 *
 */
public class Copy {

	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		copy("IO开篇.mp4","IO-copy.mp4");  //一个大文件，才能看到缓冲流的效果，性能会得到提升
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}
	
	public static void copy(String srcPath,String destPath) {
		//1、创建源
			File src = new File(srcPath); //源头
			File dest = new File(destPath);//目的地
			//2、选择流		
			try( InputStream is=new BufferedInputStream(new FileInputStream(src));
					OutputStream os =new BufferedOutputStream( new FileOutputStream(dest));	) {				
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
