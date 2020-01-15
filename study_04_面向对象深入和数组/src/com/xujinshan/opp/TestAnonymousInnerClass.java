package com.xujinshan.opp;
/**
 * 测试匿名内部类
 * @author xujinshan361@163.com
 *
 */
public class TestAnonymousInnerClass {
	
	public static  void  test01(AA a){
		System.out.println("###########");
		a.aa();
	}
	
	public static void main(String[] args) {
		TestAnonymousInnerClass.test01(new AA(){
			//重写AA类的方法
			@Override
			public void aa() {
				System.out.println("TestAnonymousInnerClass.main(...).new AA() {...}.aa()");
			}
			
		});
		
	}

}


interface  AA {
	void  aa();
}

