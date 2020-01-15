package com.xujinshan.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
MySql 环境变量：将bin目录添加到PATH中
命令行操作	
	登录操作：		mysql -hlocalhost -uroot -p123456
	退出操作：		exit
	数据库操作：	
		建库：			create database testjdbc
		卸载：			drop database testjdbc
		显示所有数据库：	show databases
		选择库：			use testjdbc
	表操作：
		显示库中的所有表：	show tables
 */
/**
 * 测试跟数据库连接链接
 * @author xujinshan361@163.com
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			long start = System.currentTimeMillis();
			//建立连接(连接对象内部其实包含了Socket对象，是一个远程的连接，比较耗时，这是Connection对象管理的一个要点)
			//真正开发中，为了，提高效率，都会使用连接池来管理连接对象！
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testjdbc", "root", "123456");
			long end = System.currentTimeMillis();
			System.out.println(conn);
			System.out.println("建立链接耗时："+(end-start)+"ms");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
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
