package com.xujinshan.test;

/**
 * 测试包装类
 * Integer类的使用
 * @author xujinshan361@163.com
 *
 */
public class TestWrappedClass {
	public static void main(String[] args) {
		//基本数据类型转成包装类型
		Integer   a  = new  Integer(3);
		Integer   b  = Integer.valueOf(30);   

		//包装类型转成基本数据类型
		int   c  =  b.intValue();
		double d = b.doubleValue();
		
		//把字符串转成包装类型
		Integer  e = new  Integer("9999");
		Integer  f = Integer.parseInt("999888");
		
		//把包装类型转成字符串
		String   str = f.toString();    //""+f
		
		//常见的常量
		System.out.println("int类型的最大数："+Integer.MAX_VALUE);
		
		
		
		
	}
}
                                                                                                                                                                                                                                                                                          asic/p.xml"),handler);
		
		//获取数据
		List<Person> persons = handler.getPersons();
		for(Person p:persons) {
			System.out.println(p.getName()+"--->"+p.getAge());
		}
	}
}

class PersonHandler extends DefaultHandler{
	private List<Person> persons;
	private Person person;
	private String tag; //存储操作标签
	
	@Override
	public void startDocument() throws SAXException {
//		System.out.println("-----解析文档开始-------");
		persons = new ArrayList<Person>();
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
//		System.out.println(qName + "--> 解析开始");
		if(null != qName) {
			tag = qName;   //存储标签名
		}
		if(tag.equals("person")) {
			person = new Person();
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String contents = new String(ch,start,length).trim();
		if(tag != null) {    //处理字符串空的问题
			if(tag.equals("name")) {
				person.setName(contents);
				
			}else if(tag.equals("age")) {
				if(contents.length()>0) {
					person.setAge(Integer.valueOf(contents));
				}
			}
		}
	}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
//		System.out.println(qName + "--> 解析结束");
		if(qName != null) {
			if(qName.equals("person")) {
				persons.add(person);
			}
		}
		tag = null;         //解决xml换行导致的空字符串覆盖问题
	}
	
	@Override
	public void endDocument() throws SAXException {
//		System.out.println("-----解析文档结束-------");
	}
	
	public List<Person> getPersons() {
		return persons;
	}
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
}