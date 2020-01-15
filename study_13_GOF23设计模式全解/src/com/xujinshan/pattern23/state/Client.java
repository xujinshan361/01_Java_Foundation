package com.xujinshan.pattern23.state;

/**
 * 状态模式 state
 * 核心：
 * 		用于解决系统中复杂对象的状态转换以及不同状态下行为的封装问题
 * 结构：
 * 		Context环境类
 * 			环境类中维护一个state对象，它是定义了当前状态
 * 		State抽象状态类
 * 		ConcreteState具体状态类
 * 			每一个类封装了一个状态对应的行为
 * @author xujinshan361@163.com
 *
 */
public class Client {
	public static void main(String[] args) {
		HomeContext ctx = new HomeContext();
		
		ctx.setState(new FreeState());
		ctx.setState(new BookedState());
		
	}
}
