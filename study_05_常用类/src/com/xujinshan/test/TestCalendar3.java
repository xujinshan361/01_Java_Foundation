package com.xujinshan.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历程序(第二个版本)
 * @author xujinshan361@163.com
 *
 */
public class TestCalendar3 {
	
	public static void main(String[] args) throws ParseException {
		System.out.println("请输入人日期(格式：2020-9-10):");
		Scanner  scanner  =  new Scanner(System.in);
		String  str = scanner.nextLine();
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = df.parse(str);
		Calendar  c = new GregorianCalendar();
		c.setTime(date);
		
		int  day = c.get(Calendar.DAY_OF_MONTH);
		int days = c.getActualMaximum(Calendar.DATE);
		
		System.out.println("日\t一\t二\t三\t四\t五\t六");

		
		c.set(Calendar.DAY_OF_MONTH, 1);  
		
		for(int i=0;i<c.get(Calendar.DAY_OF_WEEK)-1;i++){
			System.out.print("\t");
		}
		
		for(int i=1;i<=days;i++){
			if(day == c.get(Calendar.DAY_OF_MONTH)){
				System.out.print(c.get(Calendar.DAY_OF_MONTH)+"*\t");
			}else{
				System.out.print(c.get(Calendar.DAY_OF_MONTH)+"\t");
			}
			
			if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY){
				System.out.println();   	//换行
			}
			
			c.add(Calendar.DAY_OF_MONTH, 1); 
			
		}
		
	}
	
}
