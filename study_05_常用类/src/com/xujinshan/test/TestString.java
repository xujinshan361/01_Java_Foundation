package com.xujinshan.test;

public class TestString {
	public static void main(String[] args) {
//		String   str = "aaabbbb";
//		String   str2 = str.substring(2, 5);
//		
//		System.out.println(str);
//		System.out.println(str2);
		
		
		
		//编译器做了优化,直接在编译的时候将字符串进行拼接
        String str1 = "hello" + " java";//相当于str1 = "hello java";
        String str2 = "hello java";
        System.out.println(str1 == str2);//true
        String str3 = "hello";
        String str4 = " java";
        //编译的时候不知道变量中存储的是什么,所以没办法在编译的时候优化
        String str5 = str3 + str4;
        System.out.println(str2 == str5);//false
		
        System.out.println(str2.equals(str5));  //做字符串比较的时候，使用equals不要使用==   
	}
}
