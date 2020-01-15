package com.xujinshan.test01;
/**
 * 测试static关键字
 * @author xujinshan361@163.com
 *
 */
public class User2 {
    int id; // id
    String name; // 账户名
    String pwd; // 密码
    
    static String company = "阿里巴巴"; // 公司名称
    
    
    public User2(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void login() {
    	printCompany();
    	System.out.println(company); 
        System.out.println("登录：" + name);
    }
    
    public static void printCompany() {
//         login();//调用非静态成员，编译会报错
        System.out.println(company);
    }
    
    public static void main(String[] args) {
        User2 u = new User2(101, "张三");
        User2.printCompany();
        User2.company = "腾讯";
        User2.printCompany();
    }
}