package com.xujinshan.mypro03;
/**
 * 带标签的break和continue
 * @author xujinshan361@163.com
 *
 */
public class TestLabelContinue {
	public static void main(String[] args) {
		// 打印101 - 150 之间的所有质数
		outer: for (int i = 101; i < 150; i++) {
			for (int j = 2; j < i / 2; j++) { //内循环判断是否是质数
				if (i % j == 0) {
					continue outer;  //直接跳到指定部分
				}
			}
			System.out.print(i + "  ");
		}
	}
}
