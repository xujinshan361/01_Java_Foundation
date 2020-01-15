package com.xujinshan.thread.study01;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

/**
 * 下载图片
 * @author xujinshan361@163.com
 *
 */
public class WebDownloader {
	/**
	 * 下载
	 * @param url
	 * @param name
	 */
	public void download(String url,String name) {
		try {
			FileUtils.copyURLToFile(new URL(url), new File(name));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println("不合法的url");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("下载失败"); 
		}
	}
}
