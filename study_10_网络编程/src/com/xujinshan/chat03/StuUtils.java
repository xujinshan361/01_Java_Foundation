package com.xujinshan.chat03;

import java.io.Closeable;

/**
 * 工具类
 * 
 * @author xujinshan361@163.com
 *
 */
public class StuUtils {
	/**
	 * 释放资源
	 */
	public static void close(Closeable... targets ) {
		for(Closeable target:targets) {
			try {
				if(null!=target) {
					target.close();
				}
			}catch(Exception e) {
				
			}
		}
	}
}
