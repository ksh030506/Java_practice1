package com.javalec.API;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	
	
	
	System.out.println(System.currentTimeMillis());   //현재시간을 1/1,000초 단위로 표시 한다
	System.out.println();
	System.out.println();
	
	String str ="A";
	long starNum = System.currentTimeMillis();
	
	for(int i = 0; i <50000; i++) {
		str = str + "A";
	}
	
	long endNum = System.currentTimeMillis();
	System.out.println("경과 시간 : " + (endNum - starNum));
	
	
	
	System.out.println();
	System.out.println();
	System.out.println();
	
	StringBuilder str1 = new StringBuilder();
	long starNum1 = System.currentTimeMillis();
	
	for(int i = 0; i <50000; i++) {
		str1 = str1.append("A");
	}
	
	System.out.println(str1);
	long endNum1 = System.currentTimeMillis();
	System.out.println("경과 시간 : " + (endNum1 - starNum1));
	
	System.out.println("String <<<<< StringBuilder");
	}

}
