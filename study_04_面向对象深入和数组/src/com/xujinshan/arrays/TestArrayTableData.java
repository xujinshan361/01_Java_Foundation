package com.xujinshan.arrays;

import java.util.Arrays;

/**
 * 测试数组存储表格数据
 * @author xujinshan361@163.com
 *
 */
public class TestArrayTableData {
	public static void main(String[] args) {
		Object[]  emp1 = {1001,"张三",18,"程序员","2006.6.6"};
		Object[]  emp2 = {1002,"李四",19,"架构师","2016.6.6"};
		Object[]  emp3 = {1003,"王五",22,"讲师","2026.6.6"};
		
		Object[][] tableData = new Object[3][];
		tableData[0] = emp1;
		tableData[1] = emp2;
		tableData[2] = emp3;
		
		for(Object[] temp: tableData){
			System.out.println(Arrays.toString(temp));
		}
		
		
	}
}
