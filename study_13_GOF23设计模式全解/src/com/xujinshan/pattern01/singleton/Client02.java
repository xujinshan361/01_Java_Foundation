package com.xujinshan.pattern01.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试反射和反序列化破解单例模式
 * @author xujinshan361@163.com
 *
 */
public class Client02 {
	
	public static void main(String[] args) throws Exception{
		SingletonDemo06 s1 = SingletonDemo06.getInstance();
		SingletonDemo06 s2 = SingletonDemo06.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
//		//通过反射的方式直接调用私有的构造器
//		Class<SingletonDemo06> clazz = (Class<SingletonDemo06>) Class.forName("com.xujinshan.pattern01.singleton.SingletonDemo06");
//		Constructor<SingletonDemo06> c = clazz.getDeclaredConstructor(null);
//		c.setAccessible(true);   //跳过安全检查
//		SingletonDemo06 s3 = c.newInstance();
//		SingletonDemo06 s4 = c.newInstance();
//		System.out.println(s3);
//		System.out.println(s4);
		
		//通过反序列化的方式构造多个对象
		FileOutputStream fos = new FileOutputStream("d:/a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
		SingletonDemo06 s3 =  (SingletonDemo06) ois.readObject();
		System.out.println(s3);
	}
}
