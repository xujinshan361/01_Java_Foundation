package com.xujinshan.io.test01;

import java.io.File;
import java.io.IOException;

/**
 * 名称或路径
 * getName(): 名称
 * getPath(): 相对、绝对
	 * getAbsolutePath(): 绝对
	 * getParent(): 上路径， 返回null
 * @author xujinshan361@163.com
 *
 */
public class FileDemo03 {

	public static void main(String[] args) throws IOException{
		File src = new File("IO.png");
		
		//基本信息
		System.out.println("名称:"+src.getName());
		//getPath(),构建的是绝对路径就获取绝对路径，构建的是相对路径就给相对路径
		System.out.println("路径:"+src.getPath());
		System.out.println("绝对路径:"+src.getAbsolutePath());   //不管构建的是什么路径，都返回绝对路径
		System.out.println("父路径:"+src.getParent());
		//getParentFile()如果构建的没有给，就没办法获取
		System.out.println("父对象:"+src.getParentFile().getName());
	}

}
