package com.xujinshan.mycollection;

import java.util.HashMap;
import java.util.TreeSet;

/**
 * 手动实现一个HashSet 深刻理解HashSet底层原理
 * @author xujinshan361@163.com
 *
 */
public class StuHashSet {
	
	HashMap map;
	
	private static final Object  PRESENT = new Object();
	
	public StuHashSet() {
		map = new HashMap();
	}
	
	public  int  size(){
		return  map.size();
	}
	
	public void add(Object o){
		map.put(o, PRESENT);
	}
	
	@Override
	public String toString() {
		
		StringBuilder   sb = new StringBuilder();
		sb.append("[");
		
		for(Object key:map.keySet()){
			sb.append(key+",");
		}
		sb.setCharAt(sb.length()-1, ']');  
		return  sb.toString();
		
	}
	
	public static void main(String[] args) {
		StuHashSet   set = new StuHashSet();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set);
		
	}
	
}
