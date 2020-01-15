package com.xujinshan.pattern09.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理测试
 * AOP(面向切面编程)
 * 常用术语：
 * 		切面(Aspect):其实就是共有功能的实现
 * 		通知(Advice):是切面的具体实现
 * 		连接点(Joinpoint)：是程序在运行过程中能够插入切面的地点
 * 		切入点(Pointcut)：用于定义通知应该切入哪些连接点
 * 		目标对象(Target):就是那些即将切入切面的对象，也就是那些被通知的对象
 * 		代理对象(Proxy):将通知应用到目标对象之后被动态创建的对象
 * 		织入(Weaving):将切面应用到目标对象从而创建一个新的代理对象的过程
 * @author xujinshan361@163.com
 *
 */
public class Client {
	public static void main(String[] args) {
		
		Star realStar = new RealStar();
		StarHandler handler = new StarHandler(realStar);
		
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), 
				new Class[]{Star.class}, handler);
		
		proxy.sing();
		
	}
	
}