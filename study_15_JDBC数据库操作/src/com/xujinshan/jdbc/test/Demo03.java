package com.xujinshan.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 测试PreparedStatement 的基本用法
 * @author xujinshan361@163.com
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","123456");
			
			String sql = "insert into t_user (username,pwd,regTime) value(?,?,?)";          //?占位符
			ps = conn.prepareStatement(sql);
//			ps.setString(1, "lisi");        //参数索引是从1开始的，而不是0
//			ps.setString(2, "11111");
//			ps.setDate(3, new java.sql.Date(System.currentTimeMillis()));
//			ps.execute();
			
//			可以使用setObject 方法处理参数
			ps.setObject(1, "李四");
			ps.setObject(2,"22222");
			ps.setObject(3,new java.sql.Date(System.currentTimeMillis()));
			
			System.out.println("插入一行记录");
//			ps.execute(); //运行语句，返回是否有结果集
			int count = ps.executeUpdate();     //运行insert/update/delete 操作，返回更新的行数
//			executeQuery() 运行select语句，返回ResultSet 结果集
			System.out.println(count);
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) {
					ps.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn!=null) {
					conn.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
