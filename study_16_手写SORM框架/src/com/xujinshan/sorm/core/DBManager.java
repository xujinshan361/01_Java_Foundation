package com.xujinshan.sorm.core;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.xujinshan.sorm.bean.Configuration;

/**
 * 根据配置信息，维持连接对象的管理(增加连接池功能)
 * @author xujinshan361@163.com
 *
 */
public class DBManager {

	private static Configuration conf;
	
	static {  // 静态代码块
		Properties pros = new Properties();
		try {
			pros.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		conf = new Configuration();
		conf.setDriver(pros.getProperty("driver"));
		conf.setPoPackage(pros.getProperty("poPackage"));
		conf.setPwd(pros.getProperty("pwd"));
		conf.setSrcPath(pros.getProperty("srcPath"));
		conf.setUrl(pros.getProperty("url"));
		conf.setUser(pros.getProperty("user"));
		conf.setUsingDB(pros.getProperty("usingDB"));
	}
	
	public static Connection getConn() {
		try {
			Class.forName(conf.getDriver());
			// 直接建立连接，后期增加连接池处理，提高效率
			return DriverManager.getConnection(conf.getUrl(), conf.getUser(), conf.getPwd());  
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void close(ResultSet rs, Statement ps ,Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			if (ps != null) {
				ps.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn != null) {
				conn.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Statement ps,Connection conn){
		try {
			if(ps!=null){
				ps.close();
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
	
	public static void close(Connection conn){
		try {
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 返回Configuration对象
	 * @return
	 */
	public static Configuration getConf() {
		return conf;
	}
}
