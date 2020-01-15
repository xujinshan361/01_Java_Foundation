package com.xujinshan.mycollection;

/**
 * 自定义一个链表
 * 增加get方法
 * @author xujinshan361@163.com
 *
 */
public class StuLinkedList02 {
	
	private   Node  first;
	private  Node  last;
	
	private  int size;
	
	

	//[]    
	//["a","b","c","d","e","f"]           2
	public  Object  get(int index) {  
	
		
		if(index<0||index>size-1){
			throw  new RuntimeException("索引不合法:"+index);
		}
		
		Node  temp = null;
		
		if(index<=(size>>1)){   //size>>1 相当于除以2
			temp = first;
			for(int i=0;i<index;i++){  //从前往后找
				temp = temp.next;
			}
		}else{
			temp = last;
			for(int i=size-1; i>index;i--){  //从后往前找
				temp = temp.previous;
			}
		}
		
		
		return temp.element;
	}

	public  void  add(Object  obj) {
		Node  node  = new Node(obj);
		
		if(first==null){
//			node.previous = null;
//			node.next = null;
			first = node;
			last = node;
		}else{
			
			node.previous = last;
			node.next = null;
			
			last.next = node;
			last = node;
			
		}
		
		size++;	
	}
	
	@Override
	public String toString() {
		//[a,b,c]     first=a,    last=c
		//a,b,c
		StringBuilder   sb = new StringBuilder("[");
		Node  temp = first;
		while(temp!=null){
			sb.append(temp.element+",");
			temp = temp.next;
		}
		sb.setCharAt(sb.length()-1, ']'); 
		
		return sb.toString();
	}	
	
	public static void main(String[] args) {
		StuLinkedList02  list = new StuLinkedList02();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		
		System.out.println(list.get(3));	
	}
}
