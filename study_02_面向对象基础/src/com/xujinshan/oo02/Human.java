package com.xujinshan.oo02;

public  class  Human {
	private  int age ;
	String  name;			//默认类型为default 可以被本包下面的类访问
	protected   int  height;   
	
	
	public  void   sayAge(){
		System.out.println(age);
	}
}