package com.xujinshan.annotation.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.METHOD,ElementType.TYPE})
//用于描述注解的使用范围(即：被描述的注解可以用在什么地方)
/*
PACKAGE:			package包
TYPE:				类、接口、枚举、Annotation类型
CONSTRUCTOR:		描述构造器
FIELD:				描述域
METHOD:				描述方法
LOCAL_VARIABLE:		描述局部变量
PARAMETER:			描述参数
 */
@Retention(RetentionPolicy.RUNTIME)
//表示需要在什么级别保存该注解信息，用于描述注解的生命周期
/*
SOURCE:			在源文件中有效(即源文件保留)
CLASS:			在class文件中有效(即class保留)
RUNTIME:		在运行时有效(即运行时保留)-->为Runtime可以被反射机制读取
 */
public @interface MyAnnotation01 {
	//这里面是属性不是方法
	String studentName()  default "";
	int age() default 0;
	int id() default -1;   //String indexOf("abc")    表示不存在
	
	String[] schools() default {"清华"};
}
