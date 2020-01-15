package com.xujinshan.server_study01.basic;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.events.StartElement;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 熟悉SAX解析流程
 * XML：Extensible Markup Language ,可扩展标记语言
 * 作为数据的一种存储格式或用于存储软件的参数，程序解析此配置文件，可以达到不修改代码就能更改程序的目的
 * @author xujinshan361@163.com
 *
 */
public class XmlTest01 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//SAX 解析
		//1.获取解析工厂
		SAXParserFactory factory =SAXParserFactory.newInstance();
		//2.从解析工厂获取解析器
		SAXParser parse = factory.newSAXParser();
		//3.编写处理器
		//4.加载文档Document注册处理器
		PHandler handler = new PHandler();
		//5.解析
		parse.parse(Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("com/xujinshan/server_study01/basic/p.xml"), handler);
	}
}


class PHandler extends DefaultHandler{
	
	@Override
	public void startDocument() throws SAXException {
		System.out.println("-----解析文档开始-------");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println(qName + "--> 解析开始");
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String contents = new String(ch,start,length).trim();
		if(contents.length()>0) {
			System.out.println("内容为 -->" + contents);
		}else {
			System.out.println("内容为 --> "+ "空");
		}
	}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println(qName + "--> 解析结束");
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("-----解析文档结束-------");
	}
}