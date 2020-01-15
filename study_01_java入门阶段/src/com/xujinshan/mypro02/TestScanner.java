package com.xujinshan.mypro02;
import  java.util.Scanner;
/**
 * 测试键盘输入
 * @author xujinshan361@163.com
 *
 */
public class TestScanner {
	public static void main(String[] args) {
		Scanner   scanner =  new Scanner(System.in);
		System.out.println("请输入名字");
		String   name =  scanner.nextLine();
		System.out.println("请输入你的爱好");
		String  favor = scanner.nextLine();
		System.out.println("请输入你的年龄");
		int   age = scanner.nextInt();
		
		System.out.println("###############");
		System.out.println(name);
		System.out.println(favor);
		System.out.println("来到地球的天数"+age*365);
		System.out.println("离开地球的天数"+(100-age)*365);
		
	}
}
