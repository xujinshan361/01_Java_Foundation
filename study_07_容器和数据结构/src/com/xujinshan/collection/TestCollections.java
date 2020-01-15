package com.xujinshan.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections 辅助类的使用
 * Collection 是接口 Collections是工具类
 * @author xujinshan361@163.com
 *
 */
public class TestCollections {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for(int i=0;i<10;i++) {
			list.add("张三:"+i);     //通过add方法添加项
		}
		System.out.println(list);
		
		Collections.shuffle(list);        //随机排列list中的元素
		System.out.println(list);
		
		Collections.reverse(list);   //逆序排列
		System.out.println(list);
		
		Collections.sort(list);         //按照递增的方式排列，自定义类的使用，Comparable接口
		System.out.println(list);
		
		System.out.println(Collections.binarySearch(list, "张三:5"));   //二分查找，或者折半查找
	}
}
