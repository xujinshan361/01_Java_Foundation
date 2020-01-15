package com.xujinshan.mypro03;
/**
 * 测试方法的重载
 * @author xujinshan361@163.com
 *
 */
public class TestOverload {
	public static void main(String[] args) {
        System.out.println(add(3, 5));// 8
        System.out.println(add(3, 5, 10));// 18
        System.out.println(add(3.0, 5));// 8.0
        System.out.println(add(3, 5.0));// 8.0
        
        
     //已经见过的方法重载
        System.out.println();// 0个参数
        System.out.println(1);//参数是一个int
        System.out.println(3.0);//参数是一个double
        
    }
    //求和方法
    public static int add(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }
 /*   
  //编译出错：只有返回值不同，不构成方法的重载
    public static double add(int n1, int n2) {
        double sum = n1 + n2;
        return sum;
    }
    //编译出错：只有参数名称不同，不构成重载
    public static int add(int n2, int n1) {
        double sum = n1 + n2;         
        return sum;
    }  
   */ 
    
    // 方法名相同，参数的个数不同，构成重载
    public static int add(int n1, int n2, int n3) {
        int sum = n1 + n2 + n3;
        return sum;
    }
    // 方法名相同，参数类型不同，构成重载
    public static double add(double n1, int n2) {
        double sum = n1 + n2;
        return sum;
    }
    // 方法名相同，参数顺序不同，构成重载
    public static double add(int n1, double n2) {
        double sum = n1 + n2;
        return sum;
    }


    

}
