package com.xujinshan.pattern06.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 实现深复制
 * @author xujinshan361@163.com
 *
 */
public class Sheep02 implements Cloneable,Serializable{
	
	private String sname;
	private Date birthday;
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();  //直接调用object对象的clone()方法！
		
		
		//添加如下代码实现深复制(deep Clone)
		Sheep02 s = (Sheep02) obj;
		s.birthday = (Date) this.birthday.clone();  //把属性也进行克隆！
		
		return obj;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public Sheep02(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}
	
	public Sheep02() {
		super();
	}
	
}
