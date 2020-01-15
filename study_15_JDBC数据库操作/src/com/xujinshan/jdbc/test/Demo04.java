package com.xujinshan.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 测试ResultSet结果集的基本用法
 * @author xujinshan361@163.com
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","123456");
			
			String sql = "select id,username,pwd from t_user where id >?";   //?占位符
			ps = conn.prepareStatement(sql);
			ps.setObject(1, 2);           //将id>2的记录都取出来
			
			rs = ps.executeQuery();
			while(rs.next()) {//通过游标打印
				System.out.println(rs.getInt(1)+"---"+rs.getString(2)+"---"+rs.getString(3));
			}
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			//遵循：ResultSet --> Statment -->Connection   这样的关闭顺序，一定要三个分开写。
			try {
				if(rs!=null) {
					rs.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
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
