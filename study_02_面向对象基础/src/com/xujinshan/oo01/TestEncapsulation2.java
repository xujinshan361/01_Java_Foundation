package com.xujinshan.oo01;

import com.xujinshan.oo02.Human;

public class TestEncapsulation2   {
	public static void main(String[] args) {
		Human  h = new Human();
//		h.age = 13;
//		h.name = "张三";		//name 为 default 属性，不能被不同包的类访问
		
		h.sayAge();
		
	}
}

class  Girl   extends  Human  {
	void  sayGood(){
		System.out.println(height); 
	}
}