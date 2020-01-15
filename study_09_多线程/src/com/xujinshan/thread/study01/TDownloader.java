package com.xujinshan.thread.study01;
/**
 * 
 * @author xujinshan361@163.com
 *
 */

public class TDownloader extends Thread {
	private String url; //远程路径
	private String name;  //存储名字
	
	public TDownloader(String url, String name) {
		this.url = url; 
		this.name = name;
	}

	@Override
	public void run() {
		WebDownloader wd =new WebDownloader();
		wd.download(url, name);		
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		TDownloader td1 =new TDownloader("http://upload.news.cecb2b.com/2014/0511/1399775432250.jpg","phone.jpg");
		TDownloader td2 =new TDownloader("http://p1.pstatp.com/large/403c00037462ae2eee13","spl.jpg");
		TDownloader td3 =new TDownloader("http://5b0988e595225.cdn.sohucs.com/images/20170830/d8b57e0dce0d4fa29bd5ef014be663d5.jpeg","success.jpg");
		
		//启动三个线程
		td1.start();
		td2.start();
		td3.start();
	}
}
