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
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		Date now =new Date();
		Calendar   calendar   =   new   GregorianCalendar(); 
	    calendar.setTime(now); 
	    calendar.add(calendar.DATE,1);//��������������һ��.����������,������ǰ�ƶ� 
	    now=calendar.getTime();   //���ʱ���������������һ��Ľ�� 
	    System.out.println(now);// new Date()Ϊ��ȡ��ǰϵͳʱ��
		//now.setDate(-20);
		System.out.println(df.format(now));// new Date()Ϊ��ȡ��ǰϵͳʱ��
		System.out.println(df.format(new Date()));// new Date()Ϊ��ȡ��ǰϵͳʱ��
	}

}
