package com.xujinshan.collection;

import java.util.HashMap;
import java.util.Map;
/**
 * 测试Map的常用方法
 * @author xujinshan361@163.com
 *
 */
public class TestMap2 {
	public static void main(String[] args) {
		
		Employee  e1 = new Employee(1001, "张三", 50000);
		Employee  e2 = new Employee(1002, "小二", 5000);
		Employee  e3 = new Employee(1003, "小五", 6000);
		Employee  e4 = new Employee(1001, "小六", 7000); //相同的键会覆盖前面的
		
	//	System.out.println(e1.hashCode()); 
		System.out.println(1001);
		Object d;
		Integer i;
		
		Map<Integer,Employee>  map = new HashMap<>();
		
		map.put(1001, e1);
		map.put(1002, e2);
		map.put(1003, e3);
		map.put(1001, e4);
		Employee  emp = map.get(1001);
		System.out.println(emp.getEname());
		
		System.out.println(map);
		
		
	}
}


//雇员信息
class  Employee {
	private  int  id;
	private String ename;
	private double salary;
	
	public Employee(int id, String ename, double salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return  "id:"+id+"name:"+ename+"薪水:"+salary;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}