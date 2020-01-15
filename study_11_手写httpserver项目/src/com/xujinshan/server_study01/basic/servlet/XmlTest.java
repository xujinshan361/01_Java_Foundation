package com.xujinshan.server_study01.basic.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 熟悉SAX解析流程
 * @author xujinshan361@163.com
 *
 */
public class XmlTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		//SAX解析
		//1.获取工厂
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//2.从解析工厂获取解析器
		SAXParser parse = factory.newSAXParser();
		//3.编写处理器
		//4.加载文档 Document 注册处理器
		WebHandler handler = new WebHandler();
		
		//5.解析
		parse.parse(Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("com/xujinshan/server_study01/basic/servlet/web.xml"), handler);
		
		//获取数据
		WebContext context = new WebContext(handler.getEntitys(), handler.getMappings());
		//假设输入了/login
		String className = context.getClz("/login");
		Class clz = Class.forName(className);
		Servlet servlet = (Servlet)clz.getConstructor().newInstance();
		System.out.println(servlet);
		servlet.service();     //多态
	}
}

class WebHandler extends DefaultHandler{
	private List<Entity> entitys;
	private List<Mapping> mappings;
	private Entity entity;
	private Mapping mapping;
	private String tag;           //存储操作标签
	private boolean isMapping  = false;    
	
	@Override
	public void startDocument() throws SAXException {
		entitys = new ArrayList<Entity>();
		mappings = new ArrayList<Mapping>();
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if(null != qName) {
			tag = qName;      //存储标签名
			if(tag.equals("servlet")){
				entity = new Entity();
				isMapping =false;
			}else if(tag.equals("servlet-mapping")) {
				mapping = new Mapping();
				isMapping = true;
			}
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String contents = new String(ch,start,length).trim();
		if(tag != null) {   //处理了空的问题
			if(isMapping) {     //操作 servlet-mapping
				if(tag.equals("servlet-name")) {
					mapping.setName(contents);
				}else if(tag.equals("url-pattern")) {
					mapping.addPattern(contents);
				}
			}else {//操作servlet
				if(tag.equals("servlet-name")) {
					entity.setName(contents);
				}else if(tag.equals("servlet-class")) {
					entity.setClz(contents);
				}
			}
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(null != qName) {       //这个地方不能使用tag判断，因为可能是上次保存的tag没有更新
			if(qName.equals("servlet")) {
				entitys.add(entity);
			}else if(qName.equals("servlet-mapping")) {
				mappings.add(mapping);
			}
		}
		tag = null;
	}
	
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
	}
	
	public List<Entity> getEntitys() {
		return entitys;
	}
	
	public List<Mapping> getMappings() {
		return mappings;
	}
}
