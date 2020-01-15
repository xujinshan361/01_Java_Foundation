package com.xujinshan.pattern22.templatemethod;

/**
 * 模板方法模式 templateMethod
 * 介绍：
 * 		模板方法模式是编程中经常用得到的模式，它定义了一个操作中的算法骨架，将某些步骤延迟到子类中实现，这样，新的子类可以在不改变一个算法结构的前提下重新定义该算法的某些特定步骤
 * 核心：	
 * 		处理某个流程的代码已经都具备，但是其中某个节点的代码暂时不能确定，因此，我们采用模板方法模式，将这个节点的代码实现转移给子类完成
 * 		即：处理步骤父类中定义好，具体实现延迟到子类中定义
 * 什么时候用到模板方法模式：
 * 		实现一个算法时，整体步骤很固定，但是某些部分易变，易变部分可以抽象出来，供子类实现
 * 开发中常见场景：
 * 		非常频繁，各个框架，类库中都有，
 * 			数据库访问的封装
 * 			Junit单元测试
 * 			Servlet中关于doGet/doPost方法调用
 * 			Hibernate中模板程序
 * 			Spring 中JDBCTemplate，HibernateTemplate等
 * @author xujinshan361@163.com
 *
 */
public class Client {
	public static void main(String[] args) {
		BankTemplateMethod btm = new DrawMoney();
		btm.process();
		
		//采用匿名内部类 -- 经常采用的方式
		BankTemplateMethod btm2 = new BankTemplateMethod() {
			
			@Override
			public void transact() {
				System.out.println("我要存钱！");
			}
		};
		btm2.process();
		
		BankTemplateMethod btm3 = new BankTemplateMethod() {
			@Override
			public void transact() {
				System.out.println("我要理财！我这里有2000万韩币");
			}
		};
		
		btm3.process();
	}
}

class DrawMoney extends BankTemplateMethod {

	@Override
	public void transact() {
		System.out.println("我要取款！！！");
	}
}
