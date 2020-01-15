package com.xujinshan.oo02;
/**
 * 测试继承
 * @author xujinshan361@163.com
 *
 */
public class TestExtends {
	public static void main(String[] args) {
		Student   stu  =  new Student();
		stu.name="张三";
		stu.height = 172;
		stu.rest();
		
		Student  stu2 = new Student("李四",6,"计算机");
		
		System.out.println(stu2 instanceof Student);     //判断一个对象是否属于一个类
		System.out.println(stu2 instanceof Person ); 
		System.out.println(stu2 instanceof Object ); 
		System.out.println(new Person()   instanceof   Student ); 
		
	}
}


class  Person   /*extends  Object*/ {
	String  name;
	int   height;
	
	public void  rest(){
		System.out.println("休息一会");
	}
}

class  Student   extends  Person  {
	String   major;
	
	public   void   study(){
		System.out.println("学习俩小时");
	}
	
	public  Student(String name,int height, String  major){
		this.name = name;
		this.height = height;
		this.major = major;
	}
	
	public Student(){
	}
	
	
}