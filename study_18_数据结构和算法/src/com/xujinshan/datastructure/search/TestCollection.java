package com.xujinshan.datastructure.search;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * HashSet 底层采用HashMap，HashSet的元素做HashMap的key，统一使用Object对象作为value；
 * TreeSet 底层结构是TreeMap，都是使用红黑树
 * HashMap 底层结构是Hash表   
 * 		JDK1.7及其之前，HashMap就是一个table数组+链表实现的存储结构
 * 		JDK1.8及以后，当链表存储的数据个数大于等于8，不再采用链表存储，而是采用红黑树存储结构
 * @author xujinshan361@163.com
 *
 */
public class TestCollection {
	
	public static void main(String[] args) {
		TreeSet tset = new TreeSet();
		tset.add("aaa");
		tset.size();
		tset.clear();
		
		
		HashSet hset = new HashSet();
		hset.add("abc");
		hset.size();
		hset.isEmpty();
		
		HashMap hmap = new HashMap();
		hmap.put("cn", "China");
		hmap.put("us", "USA");
		hmap.get("cn");
	}
}
