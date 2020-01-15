package com.xujinshan.annotation.test;

/**
 * 测试自定义注解的使用
 * @author xujinshan361@163.com
 *
 */
public class Demo02 {

	@MyAnnotation01(age = 19,studentName = "zhangsan",id = 1001)
	public void test() {
		
	}
//	@MyAnnotation02(value = "aaaa")
	@MyAnnotation02("aaa")
	public void test2() {
		
	}
}
