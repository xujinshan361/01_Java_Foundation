package com.xujinshan.test01;
/**
 * 测试静态初始化块的使用
 * @author xujinshan361@163.com
 *
 */
public class User3 {
    int id;        //id
    String name;   //账号
    String pwd;   //密码
    static String company; //公司
    
    static {
        System.out.println("ִ执行类的初始化工作");
        company = "阿里巴巴";
        printCompany();
    }  
    
    public static void printCompany(){
        System.out.println(company);
    }  
    public static void main(String[] args) {
        User3  u3 = null; //创建对象会自动执行static初始化块的内容
    }
}