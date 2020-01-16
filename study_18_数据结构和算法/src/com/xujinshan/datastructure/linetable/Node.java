package com.xujinshan.datastructure.linetable;

/**
 * 单链接的结点
 * @author xujinshan361@163.com
 *
 */
public class Node {
//	private Object data;  //要存储的数据
//	private Node next;    //
	
	public Object data;
	public Node next;
	
	public Node() {
		
	}
	public Node(Object data) {
		super();
		this.data=data;
	}
	public Node(Object data,Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

}
