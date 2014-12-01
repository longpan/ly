package org.xhome.ly.utils;

import java.util.Calendar;
import java.util.Date;


/**
 * @author Rick  E-mail: maodai1990@163.com
 * @version 创建时间：2014-5-20 下午6:51:35
 * 类说明
 */
public class DateUtil {

	public static Date getTodayTimestamp(){
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		Calendar calbk = Calendar.getInstance();
		calbk.set(year, month, date-1, 24, 0, 0);
		return calbk.getTime();
	}
	public static Date getTomorrowTimeStamp(){
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		Calendar calbk = Calendar.getInstance();
		calbk.set(year, month, date, 24, 0, 0);
		return calbk.getTime();
	}


	public static Date getCertainStartTimeTimeStamp(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, day, 0, 0, 0);
		return calendar.getTime();
	}

	public static Date getCertainEndTimeTimeStamp(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, day, 24, 0, 0);
		return calendar.getTime();
	}

	public static Date getCurrentDateTime(){
		return Calendar.getInstance().getTime();
	}
	
	public static String getDateTimeStampStr(String header){
		Calendar cal = Calendar.getInstance();
		return header+cal.getTimeInMillis();
	}
	

}
 