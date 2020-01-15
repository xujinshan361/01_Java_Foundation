package com.xujinshan.reflection.test.bean;

public class User {

	private int id;
	private int age;
	private String uname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public void setUname() {
		this.uname = "张三";
	}
	//javabean 必须要有无参的构造方法
	public User() {
		super();
	}
	public User(int id, int age, String uname) {
		super();
		this.id = id;
		this.age = age;
		this.uname = uname;
	}
	
}
