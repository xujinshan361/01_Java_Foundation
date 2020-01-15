package com.xujinshan.test01;

public class User {
    int id; // id
    String name; // 用户名
    String pwd; // 密码
    
    public User() {
 
    }
    public User(int id, String name) {
//        super();					//构造方法的第一句总是super();
        this.id = id;				//this表示创建好的对象
        this.name = name;
    }
    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
//        System.gc();
    }
    
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User(101, "张三");
        User u3 = new User(100, "李四", "123456");     
    }
}