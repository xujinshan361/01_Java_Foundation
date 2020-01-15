package com.xujinshan.exception;

/**
 * 运行时异常的处理
 * RuntimeException
 * @author xujinshan361@163.com
 *
 */
public class Test01 {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		if(a!=0){
			System.out.println(b/a);
		}
		String  str = null;
		if(str!=null){
			System.out.println(str.length());
		}
		
		Animal d=new Dog();
		if(d instanceof Cat){
			Cat c=(Cat)d;
		}
		
        int[] arr = new int[5];
        int a2 = 5;
        if (a2 < arr.length) {
            System.out.println(arr[a2]);
        }
       System.out.println("RuntimeException测试");
	}
}


class Animal{
    
}
class Dog extends Animal{
     
}
class Cat extends Animal{
     
}