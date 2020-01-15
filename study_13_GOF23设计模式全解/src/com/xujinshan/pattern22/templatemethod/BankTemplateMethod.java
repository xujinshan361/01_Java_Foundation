package com.xujinshan.pattern22.templatemethod;

public abstract class BankTemplateMethod {
	//具体方法
	public void takeNumber(){
		System.out.println("取号排队");
	}
	
	public abstract void transact(); //办理具体的业务	//钩子方法
	
	public void evaluate(){
		System.out.println("反馈评分");
	}

	/**
	 * 使用final 关键字，子类不能重写，模板方法
	 */
	public final void process(){	//模板方法！！！   
		this.takeNumber();

		this.transact();

		this.evaluate();
	}
}
