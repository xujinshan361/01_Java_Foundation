package com.xujinshan.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 测试HashSet的基本用法
 * Set:没有顺序，不可重复
 * List：有顺序，可以重复
 * @author xujinshan361@163.com
 *
 */
public class TestHashSet {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		
		set1.add("aa");
		set1.add("bb");
		set1.add("aa");   //重复添加没有结果
		
		System.out.println(set1);
		
		Set<String> set2 = new HashSet<>();
		set2.add("张三");
		set2.addAll(set1);
		System.out.println(set2);
		
	}
}
