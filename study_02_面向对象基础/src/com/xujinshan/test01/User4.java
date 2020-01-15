package com.xujinshan.test01;
/**
 * 测试参数传值机制
 * @author xujinshan361@163.com
 *
 */
public class User4 {
    int id;        //id
    String name;   //账号
    String pwd;   //密码
      
    public User4(int id, String name) {
        this.id = id;
        this.name = name;
    }
     
    public void testParameterTransfer01(User4  u){
        u.name="张三";
    }
    
    public void testParameterTransfer02(User4  u){
        u  = new User4(200,"李四");
    }
     
    public static void main(String[] args) {
        User4   u1  =  new User4(100, "王五");
        
        u1.testParameterTransfer01(u1); 
        System.out.println(u1.name);

        u1.testParameterTransfer02(u1);
        System.out.println(u1.name);
    }
}