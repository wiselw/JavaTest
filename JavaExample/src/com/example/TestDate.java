package com.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDate {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");//设置日期格式
		Date now =new Date();
		Calendar   calendar   =   new   GregorianCalendar(); 
	    calendar.setTime(now); 
	    calendar.add(calendar.DATE,1);//把日期往后增加一天.整数往后推,负数往前移动 
	    now=calendar.getTime();   //这个时间就是日期往后推一天的结果 
	    System.out.println(now);// new Date()为获取当前系统时间
		//now.setDate(-20);
		System.out.println(df.format(now));// new Date()为获取当前系统时间
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
	}

}
