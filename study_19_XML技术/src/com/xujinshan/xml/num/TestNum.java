package com.xujinshan.xml.num;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import com.xujinshan.xml.pojo.Num;
import com.xujinshan.xml.utils.DBUtil;

/**
 * 备份数据为XML
 * @author xujinshan361@163.com
 *
 */
public class TestNum {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// 1. 将这些数据备份为xml文件
		// 查询所有数据为一个list集合, 泛型为Num
		List<Num> list = selAll();
		// 将list中的数据输出到一个xml文件中
		writeNum2Xml(list);
		long stop = System.currentTimeMillis();
		System.out.println("耗时:" + (stop - start));
	}

	/**
	 * 将list中的数据写入xml
	 * 
	 * @param list
	 */
	private static void writeNum2Xml(List<Num> list) {
		Document doc = DocumentHelper.createDocument();
		Element nums = doc.addElement("nums");
		// 循环为根元素添加子元素
		for (Num num : list) {
			nums.addElement("num")
				.addAttribute("id", num.getId())
				.addAttribute("type", num.getType())
				.addText(num.getNum() + "");
		}
		// 输出到文件
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = null;
		try {
			writer = new XMLWriter(new FileWriter("src/nums.xml"), format);
			writer.write(doc);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 查询所有的数据
	 * 
	 * @return
	 */
	private static List<Num> selAll() {
		List<Num> list = new ArrayList<>();

		String sql = "select * from t_num order by num";
		Connection conn = DBUtil.getConn();
		PreparedStatement pstmt = DBUtil.getPstmt(conn, sql);
		ResultSet rs = null;
		try {
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Num num = new Num();
				num.setId(rs.getString("id"));
				num.setNum(rs.getInt("num"));
				num.setType(rs.getString("type"));
				list.add(num);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, pstmt, conn);
		}
		return list;
	}

}
