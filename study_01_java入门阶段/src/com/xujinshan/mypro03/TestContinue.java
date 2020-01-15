package com.xujinshan.mypro03;
/**
 * 测试continue continue 用于结束本次循环 ，继续下一次循环
 * @author xujinshan361@163.com
 *
 */
public class TestContinue {
	public static void main(String[] args) {
		
//		把100-150之间不能被3整除的数输出，并且每行输出5个
		
		int count = 0;// 定义计数器
		for (int i = 100; i < 150; i++) {
			// 如果是3的倍数，跳出本次循环，继续执行下一次循环
			if (i % 3 == 0) {
				continue;
			}
			// 否则(不是3的倍数)，输出该数
			System.out.print(i + ".");
			count++;// 每输出一个数，计数器+1
			//根据计数器判断每行是否输出了5个数
			if (count % 5 == 0) {
				System.out.println();
				count = 0;
			}
		}
	}
}
