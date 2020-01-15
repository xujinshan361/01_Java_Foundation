package com.xujinshan.thread.study01;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/**
 * 了解创建线程的方式三：
 * 实现Callable接口，重写call方法，call 方法可以抛出异常，返回值
 * @author xujinshan361@163.com
 *
 */
public class CDownloader implements Callable<Boolean>{
	private String url; //远程路径
	private String name;  //存储名字
	
	public CDownloader(String url, String name) {
		this.url = url; 
		this.name = name;
	}

	@Override
	public Boolean call() throws Exception {
		WebDownloader wd =new WebDownloader();
		wd.download(url, name);		
		System.out.println(name);
		return true;
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CDownloader cd1 =new CDownloader("http://upload.news.cecb2b.com/2014/0511/1399775432250.jpg","phone.jpg");
		CDownloader cd2 =new CDownloader("http://p1.pstatp.com/large/403c00037462ae2eee13","spl.jpg");
		CDownloader cd3 =new CDownloader("http://5b0988e595225.cdn.sohucs.com/images/20170830/d8b57e0dce0d4fa29bd5ef014be663d5.jpeg","success.jpg");
		
		//创建执行服务: 
		ExecutorService  ser=Executors.newFixedThreadPool(3);
		//提交执行: 
		Future<Boolean> result1 =ser.submit(cd1) ;
		Future<Boolean> result2 =ser.submit(cd2) ;
		Future<Boolean> result3 =ser.submit(cd3) ;
		//获取结果:  
		boolean r1 =result1.get();
		boolean r2 =result1.get();
		boolean r3 =result1.get();
		System.out.println(r3);
		//关闭服务:  
		ser.shutdownNow();

	}
}
