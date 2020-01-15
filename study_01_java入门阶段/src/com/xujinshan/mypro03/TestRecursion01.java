package com.xujinshan.mypro03;
/**
 * 测试递归
 * @author xujinshan361@163.com
 *
 */
public class TestRecursion01 {
	public static void main(String[] args) {
		a();
	}
	
	static  int  count = 0;
	static  void  a(){
		System.out.println("a");
		count++;
		if(count<10){
			a();
		}else{
			return;
		}
		
	}
	
	static  void  b(){
		System.out.println("b");
	}
	
	
}
