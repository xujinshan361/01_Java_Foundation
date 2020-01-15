package com.xujinshan.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 测试批处理的基本用法
 * 		对于大量的批处理，建议使用Statement 因为PreparedStatement的预编译空间有限，当数据量特变大的时候，会发生异常
 * @author xujinshan361@163.com
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc","root","123456");
			
			conn.setAutoCommit(false);        //将事务提交设置为手动提交
			long start = System.currentTimeMillis();
			stmt  = conn.createStatement();
			for(int i=0;i<20000;i++) {
				stmt.addBatch("insert into t_user(username,pwd,regTime) values('xu"+i+"',66666,now())");
			}
			stmt.executeBatch();
			conn.commit();          //提交事务
			long end = System.currentTimeMillis();
			System.out.println("插入2万条数据，耗费总时间："+(end-start));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null){
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
