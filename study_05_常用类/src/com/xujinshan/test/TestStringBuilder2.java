 package com.xujinshan.test;
 /**
  * 测试StringBuilder 、 StringBuffer  可变字符序列的常见方法
  * @author xujinshan361@163.com
  *
  */
public class TestStringBuilder2 {
	public static void main(String[] args) {
		StringBuilder   sb =  new StringBuilder();
		
		for(int i=0;i<26;i++){
			char temp = (char)('a'+i);
			sb.append(temp);
		}
		
		System.out.println(sb);
		sb.reverse();		//倒序
		System.out.println(sb);
		sb.setCharAt(3, '张');
		System.out.println(sb);
		sb.insert(0, '我').insert(6, '爱').insert(10, '你');  		//链式调用。核心就是：该方调用了 return  this ，把自己返回了
		System.out.println(sb);
		
		sb.delete(20, 23);
		System.out.println(sb);
		
		
	}
}
