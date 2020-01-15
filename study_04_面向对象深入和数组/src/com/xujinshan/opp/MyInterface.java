package com.xujinshan.opp;
/**
 * interface 接口
 * @author xujinshan361@163.com
 *
 */

public interface MyInterface {
	
		/*public static final */ int  MAX_AGE=100;
		
		/*public  abstract*/ void  test01();
		
}


class  MyClass  implements MyInterface  {

	@Override
	public void test01() {
		System.out.println(MAX_AGE); 
		System.out.println("MyClass.test01()");
	}
	
}