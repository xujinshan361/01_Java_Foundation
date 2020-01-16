package com.xujinshan.loc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * 网络爬虫的原理
 * 
 * @author xujinshan361@163.com
 *
 */
public class SpiderTest01 {

	public static void main(String[] args) throws Exception {
		//获取URL
		URL url =new URL("https://www.jd.com");
		//URL url =new URL("https://www.dianping.com");
		//下载资源
		InputStream is = url.openStream();
		BufferedReader br =new BufferedReader(new InputStreamReader(is,"UTF-8"));
		String msg =null;
		while(null!=(msg=br.readLine())) {
			System.out.println(msg);
		}
		br.close();
		//分析
		//处理。。。。
	}

}
