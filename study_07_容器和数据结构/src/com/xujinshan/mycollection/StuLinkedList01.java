package com.xujinshan.mycollection;

/**
 * 自定义一个链表
 * @author xujinshan361@163.com
 *
 */
public class StuLinkedList01 {
	
	private   Node  first;
	private  Node  last;
	
	private  int size;
	

	public  void  add(Object  obj) {
		Node  node  = new Node(obj);
		
		if(first==null){
//			node.previous = null;
//			node.next = null;
			first = node;
			last = node;
		}else{
			//双向链表最后一个结点后面插入操作
			node.previous = last;
			node.next = null;
			
			last.next = node;
			last = node;
			
		}
		
		
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
		StuLinkedList01  list = new StuLinkedList01();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		
		System.out.println(list);	
	}

}
