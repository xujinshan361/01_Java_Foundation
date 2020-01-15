package com.xujinshan.pattern08.proxy.staticproxy;

/**
 * 代理模式(Proxy Pattern)
 * 		核心作用：
 * 			通过代理，控制对象的访问，可以详细控制访问某个(某类)对象的方法，在调用这个方法前做前置处理，调用这个方法后做后置处理
 * 		AOP(Aspect Oriented Programming面向切面编程)的核心实现机制
 * 			它是通过预编译方式和运行期动态代理实现在不修改源代码的情况下给程序动态统一添加功能的一种技术，它是一种新的方法论，是对传统的OOP编程的一种补充
 *  
 *核心角色：
 *	抽象角色：
 *		定义代理角色和真实角色的公共对外方法
 *	真实角色：
 *		实现抽象接口，定义真实角色所要实现的业务逻辑，供代理角色调用
 *	代理角色：
 *		实现抽象角色，是真实角色的代理，通过真实角色的业务逻辑方法来实现抽象方法，并可以附加自己的操作  
 *
 *注意：将统一的流程控制放到代理角色中处理
 * @author xujinshan361@163.com
 *
 */
public class Client {
	public static void main(String[] args) {
		Star real = new RealStar();
		Star proxy = new ProxyStar(real);
		
		proxy.confer();
		proxy.signContract();
		proxy.bookTicket();
		proxy.sing();
		
		proxy.collectMoney();
		
	}
}
