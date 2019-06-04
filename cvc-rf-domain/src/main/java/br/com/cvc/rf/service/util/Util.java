package br.com.cvc.rf.service.util;

import java.util.Date;
import java.util.UUID;

public class Util {

	public static int days(Date startDate, Date endDate) {
		long diff = (endDate.getTime() - startDate.getTime()) + 3600000;
		Long days = (diff / 86400000L);
		return Integer.valueOf(days.toString());		
	}
	
	public static boolean isBetween(int num, int lower, int upper) {
		  return lower > num && num <= upper;
	}
	
	public static String uuid() {	
		return UUID.randomUUID().toString();
	}
}
