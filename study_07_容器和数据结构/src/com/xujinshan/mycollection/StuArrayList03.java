package com.xujinshan.mycollection;

import java.util.ArrayList;

/**
 * 增加数组扩容功能
 * @author xujinshan361@163.com
 *
 * @param <E>
 */
public class StuArrayList03<E> {
	
	private Object[]  elementData;
	private int  size;
	
	private static final int DEFALT_CAPACITY = 10 ;
	
	
	public StuArrayList03(){
		elementData = new Object[DEFALT_CAPACITY]; 
	}
	
	public StuArrayList03(int  capacity) {
		elementData  = new Object[capacity];
		ArrayList l;
	}
	
	public  void  add(E  element){
		
		//什么时候扩容？
		if(size == elementData.length){
			//扩容操作
			Object[]  newArray  =  new Object[elementData.length+(elementData.length>>1)];  //10-->10+10/2
			System.arraycopy(elementData, 0, newArray, 0, elementData.length); 
			elementData = newArray;
		}
		
		elementData[size++] = element;
	}
	
	@Override
	public String toString() {
		
		StringBuilder  sb = new StringBuilder();
		
		//[a,b,c]
		sb.append("[");
		for(int i=0;i<size;i++){
			sb.append(elementData[i]+",");
		}
		sb.setCharAt(sb.length()-1, ']'); 
		
		return  sb.toString();
	}
	
	
	public static void main(String[] args) {
		StuArrayList03  s1 = new StuArrayList03();
		
		for(int i=0;i<400;i++){
			s1.add("张"+i);
		}
		System.out.println(s1);
	}	
}
