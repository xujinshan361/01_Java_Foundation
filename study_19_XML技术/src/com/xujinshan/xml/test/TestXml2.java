package com.xujinshan.xml.test;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class TestXml2 {

	public static void main(String[] args) throws Exception {
		// [1] 通过DocumentHelper生成一个Document对象
		Document doc = DocumentHelper.createDocument();
		// doc.addElement("books").addElement("book").addAttribute("id", "b01");
		// [2] 添加并得到根元素
		Element root = doc.addElement("books");
		// [3] 为根元素添加子元素
		Element book = root.addElement("book");
		// [4] 为book元素添加属性
		book.addAttribute("id", "b01");
		// [5] 为book添加子元素
		Element name = book.addElement("name");
		Element author = book.addElement("author");
		Element price = book.addElement("price");
		// [6] 为子元素添加文本
		name.addText("Thinking in Java");
		author.addText("小伟");
		price.addText("88");
		/*// [7] 将doc输出到xml文件中即可
		Writer writer = new FileWriter(new File("src/book2.xml"));
		doc.write(writer);
		// [8] 关闭资源
		writer.close();*/
		// [7] 格式良好的输出
		OutputFormat format = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(new FileWriter(new File("src/book2.xml")), format);
		writer.write(doc);
		// [8] 关闭资源
		writer.close();
	}

}
