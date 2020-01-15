package com.xujinshan.oo02;
/**
 * 测试重写(override)/覆盖
 * @author xujinshan361@163.com
 *
 */
public class TestOverride {
		public static void main(String[] args) {
			Horse   h   =  new Horse();
			h.run();
		}
}


class  Vehicle {
	public  void  run(){
		System.out.println("跑。。。。");
	}
	
	public   void stop(){
		System.out.println("ֹͣ停止！");
	}
	
	public  Person   whoIsPsg(){
		return  new Person();
	}
	
}

class    Horse   extends  Vehicle {
	public  void  run(){
		System.out.println("四蹄翻飞，加加加。。。");
	}
	
	public  Student   whoIsPsg(){//返回值类型小于等于父类的类型
		return  new Student();
	}
	
}


