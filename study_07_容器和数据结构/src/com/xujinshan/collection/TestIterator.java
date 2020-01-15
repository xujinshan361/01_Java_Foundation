package com.xujinshan.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 测试迭代器遍历：List Set Map
 * @author xujinshan361@163.com
 *
 */
public class TestIterator {
	public static void main(String[] args) {
//		测试List 迭代
//		testIteratorList();
		
//		testIteratorSet();
//		testIteratorMap();
		
		testRemove();
		
	}
	
	public static void testIteratorList() {
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		//使用迭代器iterator 遍历List
		for(Iterator<String> iter = list.iterator();iter.hasNext();) {   //hasNest()判断是否有下一个
			String temp = iter.next(); //iter.net()向下移动一个
			System.out.println(temp);
		}
	}
	
	public static void testIteratorSet() {
		Set<String> set = new HashSet<>();
		set.add("aa");
		set.add("bb");
		set.add("cc");
		
		//使用迭代器iterator 遍历set
		for(Iterator<String> iter=set.iterator();iter.hasNext();) {
			String temp = iter.next();
			System.out.println(temp);
		}
	}
	
	public static void testIteratorMap() {
		Map<Integer,String> map1 = new HashMap<>();
		map1.put(100, "aa");
		map1.put(200, "bb");
		map1.put(300, "cc");
		
		//第一种遍历Map方法
		Set<Entry<Integer,String>> ss =map1.entrySet();
		for(Iterator<Entry<Integer,String>>iters = ss.iterator();iters.hasNext();) {
			Entry<Integer,String>temp = iters.next();
			System.out.println(temp.getKey()+"-----"+temp.getValue());
		}
		
		System.out.println("============================");
		
		//第二种遍历Map方法
		Set<Integer> keySet=map1.keySet();
		for(Iterator<Integer> iter=keySet.iterator();iter.hasNext();) {
			Integer key = iter.next();
			System.out.println(key+"==========="+map1.get(key));
		}
	}
	
	//测试边遍历边删除
	public static void testRemove() {
		List<String> list = new ArrayList<>();
		for(int i =0;i<20;i++) {
			list.add("张三："+i);
		}
		
		for(int i=0;i<list.size();i++) {
			String temp = list.get(i);
			if(temp.endsWith("2")) {
				list.remove(i);
			}
				
			System.out.println(list.size());
			System.out.println(list.get(i));
		}
		
	}
}
