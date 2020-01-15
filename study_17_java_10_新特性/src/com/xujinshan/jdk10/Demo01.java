package com.xujinshan.jdk10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * JDK 10 新特性：局部变量类型推断
 * 
 * @author xujinshan361@163.com
 *
 */

class Users{
	private String username;
	private Integer userage;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getUserage() {
		return userage;
	}
	public void setUserage(Integer userage) {
		this.userage = userage;
	}
}
public class Demo01 {

	/**
	 * 注意点：
	 * 1.只针对局部变量
	 * 2.var  是保留类型不是关键字，意味着还可以使用var来定义变量名或者方法名
	 * 3.var  不允许赋值为null
	 * @param args
	 */
	public static void main(String[] args) {
		//JDK 10新特性，需要JDK10环境才能执行
		/*
		var i = 10;
		var str = "abc";
		var list = new ArrayList<>();
		list.add("list test var");
		var set = new HashSet<>();
		set.add("set test var");
		var map = new HashMap<String,String>();
		map.put("test","map test var");
		var user = new Users();
		user.setUsername("user test var");
		user.setUserage(20);
		System.out.println(i);
		
		for(var i1=0;i1<list.size();i1++) {
			System.out.println(list.get(i1));
		}
		
		for(var temp:set) {
			System.out.println(temp);
		}
		
		Set<String> keys = map.keySet();
		for(var key:keys) {
			System.out.println(map.get(key));
		}
		System.out.println(user);
		*/
		
//		var aa =null            //不允许赋值为null
	}
}
