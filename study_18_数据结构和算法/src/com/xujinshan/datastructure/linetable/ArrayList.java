package com.xujinshan.datastructure.linetable;

import java.util.Arrays;

/**
 * 顺序表
 * 底层采用的数组，但是长度可以动态的变化
 * 
 * java.util.ArrayList   
 * @author xujinshan361@163.com
 *
 */

public class ArrayList implements List {
	
	private Object[] elementData; //底层是一个数组，目前还没有确定长度
	private int size;  //不是数组分配了几个空间，而是元素的个数
	
	public ArrayList() {
		//没有指定长度，默认长度是4
		this(4);
		//没有指定长度,长度是0
		//elementData = new Object[]{};
	}
	/**
	 * @param initialCapacity 指定数组的初始长度
	 */
	public ArrayList(int initialCapacity) {
		//给数组分配指定数量的空间
		elementData = new  Object[initialCapacity];
		//指定顺序表的元素个数，默认是0
		//size=0;
	}
	
	@Override    //返回线性表元素的个数
	public int size() {
		return size;
	}

	@Override  //获取指定索引的元素
	public Object get(int i) {
		if(i<0 || i>=size){//i<0  或者 i>=size
			//throw new RuntimeException("数组索引越界异常："+i);
			throw new MyArrayIndexOutOfBoundsException("数组索引越界异常："+i);
		}
		return elementData[i];
	}

	@Override     //判断是否为空
	public boolean isEmpty() {
		return size ==0;
	}

	@Override    //判断是否包含元素e
	public boolean contains(Object e) {
		for(int i=0;i<size;i++) {
			if(elementData[i].equals(e)) {
				return true;
			}
		}
		return false;
	}

	@Override       //返回元素e第一次出现的索引位置
	public int indexOf(Object e) {
		for(int i=0;i<size;i++) {
			if(elementData[i].equals(e)) {
				return i;
			}
		}
		return -1;
	}

	@Override      //在索引为i的位置添加元素e
	public void add(int i, Object e) {
		//i的位置要正确
		if(i<0 || i>size){
			throw new MyArrayIndexOutOfBoundsException("数组索引越界异常:"+i);
		}
		//数组满了，就扩容
		if(size == elementData.length){
			grow();
		}
		//后移i及其后面元素，从最后一个元素开始
		for(int j=size ;j>i; j--){
			elementData[j] = elementData[j-1];
		}
		
		//给数组第i个位置赋值
		elementData[i] = e;
		//元素个数+1
		size++;
		//elementData[size++] = e;
		//System.out.println("length="+elementData.length);
		
	}
	
	@Override    //在最后添加元素
	public void add(Object e) {
		this.add(size, e);
//		//数组满了，就扩容
//		if(size == elementData.length){
//			grow();
//		}
//		
//		//给数组赋值
//		elementData[size] = e;
//		//元素个数+1
//		size++;
//		//elementData[size++] = e;
//		//System.out.println("length="+elementData.length);
		
	}
	
	/**
	 * 数组扩容
	 */
	private void grow(){
//		//新创建一个新的数组，长度是旧数组2倍
//		Object [] newArr = new Object[elementData.length*2];
//		//将旧数组的数据拷贝到新数组
//		for(int i=0;i<size;i++){
//			newArr[i] = elementData[i];
//		}
//		//让elementData指向新数组
//		elementData = newArr;
		elementData = Arrays.copyOf(elementData, elementData.length*2);
	}

	@Override     //在元素obj之前插入元素e
	public boolean addBefore(Object obj, Object e) {
		this.add(this.indexOf(obj), e);        //调用add方法添加，indexOf方法获取obj的索引位置
		return true;
	}

	@Override
	public boolean addAfter(Object obj, Object e) {
		this.add(this.indexOf(obj)+1,e);
		return false;
	}
	
	@Override  //删除索引为i的元素，并返回   
	public Object remove(int i) {
		if(i<0||i>size) {
			throw new MyArrayIndexOutOfBoundsException("数组索引不合法："+i);
		}
		Object obj = elementData[i];
		for(int j=i;j<size;j++) {
			elementData[j] = elementData[j+1];
		}
		size-=1;
		return obj;
	}

	@Override      //移除第一个元素为e的，并返回索引
	public int remove(Object e) {
		int index= -1;
		for(int i =0;i<size;i++) {
			if(elementData[i].equals(e)) {
				index=i;
			}
		}
		this.remove(index);
		return index;
	}

	@Override   //用元素e换取索引为i的元素，并返回原元素
	public Object replace(int i, Object e) {
		Object obj = elementData[i];
		elementData[i] =e;
		return obj;
	}
	//[123,321,456,666,678.....]
	@Override
	public String toString() {
		if(size == 0){
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		for(int i=0;i<size;i++){
			if(i !=size -1){
				builder.append(elementData[i]+",");
			}else{
				builder.append(elementData[i]);
			}
			
		}
		builder.append("]");
		return builder.toString();
	}
}
