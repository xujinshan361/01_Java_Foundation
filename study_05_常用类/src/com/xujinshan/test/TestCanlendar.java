package com.xujinshan.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * 测试日期类使用
 * @author xujinshan361@163.com
 *
 */
public class TestCanlendar {
	public static void main(String[] args) {
		//获得日期的相关元素
		Calendar calendar = new GregorianCalendar(2999,10,9,22,10,50);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int  day = calendar.get(Calendar.DATE);		//也可以使用 ：DAY_OF_MONTH
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);	//星期几：1-7   ，1：星期日，2：星期一。。。。7：星期六 
		System.out.println(year) ;
		System.out.println(month) ;	//0-11表示对应的月份。0是1月，1月是2月.....11是12月。
		System.out.println(weekday);
		System.out.println(day);
		
		//设置日期的相关元素
		Calendar c2 = new GregorianCalendar();
		c2.set(Calendar.YEAR, 8012);
		
		System.out.println(c2);
		
		//日期的计算
		Calendar c3 = new GregorianCalendar();
		c3.add(Calendar.YEAR, -100);
		System.out.println(c3) ;
		
		//日期对象和时间对象的转化
		Date  d4 =  c3.getTime();
		Calendar c4 = new GregorianCalendar();
		c4.setTime(new Date());
		
		printCalendar(c4); 
	}
	
	
	public static  void  printCalendar(Calendar  c){
		//打印：1918年10月10日 11:23:45 周三
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;   //0-11
		int  date = c.get(Calendar.DAY_OF_MONTH);
		int  dayweek  = c.get(Calendar.DAY_OF_WEEK)-1;    //1-7.1周日，2周1,3周2....
		String dayweek2 = dayweek==0?"日":dayweek+"";
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year+"年"+month+"月"+date+"日 "+hour+"时"+minute+"分"+second+"秒"
				+"   周"+dayweek2);
		
	}
	
	
	
	
}
