package com.xujinshan.test;

/**
 * 测试枚举
 */
public class TestEnum {
	public static void main(String[] args) {
		System.out.println(Season.SPRING);
		
		Season a = Season.AUTUMN;
		
		switch(a){
		case SPRING:
			System.out.println("春天来了，播种的季节");
			break;
		case SUMMER:
			System.out.println("夏天来了，游泳的季节");
			break;
		case AUTUMN:
			System.out.println("秋天来了，收获的季节");
			break;
		case WINTER:
			System.out.println("冬天来了，冬眠的季节");
			break;
			
		}
		
		
	}
}


enum  Season{
	SPRING, SUMMER,AUTUMN,WINTER
}

enum Week {
	星期一,星期二,星期三,星期四,星期五,星期六,星期日
}
