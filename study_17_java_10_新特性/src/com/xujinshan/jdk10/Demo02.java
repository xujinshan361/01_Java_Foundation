package com.xujinshan.jdk10;

import java.util.HashMap;
import java.util.Map;

/**
 * copyOf 方法的使用
 * 
 * @author xujinshan361@163.com
 *
 */
public class Demo02 {
	public static void main(String[] args) {
//		 var list = new ArrayList<String>(); list.add("a"); list.add("b");
//		 list.add("c"); list.add("d");
//		 
//		 var list2 = List.copyOf(list);
//		 
//		 list2.add("e"); //报异常，copyOf过来的是不能修改的 for(String string:list2) {
//		 for(String string :list2) {
//			 System.out.println(string); 
//		 }
		var map = new HashMap<>();
		map.put("k1", "a");
		map.put("k2", "b");
		
		var map2 = Map.copyOf(map);
		
		var keys = map2.keySet();
		for (Object object : keys) {
			System.out.println(map2.get(object));
		}
	}
}
