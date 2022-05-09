package com.practiceprograms.imppgms;

import java.util.Calendar;
import java.util.Date;

public class GetFutureDate {
public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	Date time = cal.getTime();
	System.out.println(time);
	cal.get(Calendar.DATE);
	cal.add(Calendar.DATE, 1);
	Date ftime = cal.getTime();
	System.out.println(ftime);
	//System.out.println(cal);
}
}
