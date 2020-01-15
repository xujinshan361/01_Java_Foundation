package com.xujinshan.pattern24.observer;

/**
 * 观察者模式：Observer
 * 核心：
 * 		观察者模式主要用于1：N的通知，当一个对象(目标对象Subject或者Observable)的状态变化时，它需要及时告知一系列对象(观察者，Observer)，令他们做出反应
 * 通知观察者的方式：
 * 		推：每次都会把通知以广播的方式发送给观察者，所有观察者只能被动接收
 * 		拉：观察者只要知道有情况即可，至于什么时候获取内容，获取什么内容都可以自主决定
 * @author xujinshan361@163.com
 *
 */
public class Client {
	public static void main(String[] args) {
		//目标对象
		ConcreteSubject subject = new ConcreteSubject();
		
		//创建多个观察者
		ObserverA  obs1 = new ObserverA();
		ObserverA  obs2 = new ObserverA();
		ObserverA  obs3 = new ObserverA();
		
		//将这三个观察者添加到subject对象的观察者队伍中
		subject.registerObserver(obs1);
		subject.registerObserver(obs2);
		subject.registerObserver(obs3);
		
		//改变subject的状态
		subject.setState(3000);
		System.out.println("########################");
		//我们看看，观察者的状态是不是也发生了变化
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		//改变subject的状态
		subject.setState(30);
		System.out.println("########################");
		//我们看看，观察者的状态是不是也发生了变化
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
	}
}
