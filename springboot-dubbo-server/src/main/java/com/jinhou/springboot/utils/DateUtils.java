package com.jinhou.springboot.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	
	public final static int TIME_DAY_MILLISECOND = 86400000;
	
	/**
	 * 获取某年的开始时间</br></br>
	 * 如2015年的开始时间为</br>
	 * 2015-01-01 00:00:00.000
	 * 
	 * @param date
	 * @return 某年的开始时间
	 */
	public static Date getYearBegin(Date date) {
		if(date==null)return null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH,calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}
	
	/**
	 * 获取某月的开始时间</br></br>
	 * 如2015-04月的开始时间为</br>
	 * 2015-04-01 00:00:00.000
	 * 
	 * @param date
	 * @return 某月的开始时间
	 */
	public static Date getMonthBegin(Date date) {
		if(date==null)return null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH,calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	/**
	 * 获取某天的开始时间</br></br>
	 * 如2015-04-24 12:00:00的开始时间为</br>
	 * 2015-04-24 00:00:00.000
	 * 
	 * @param date
	 * @return 某天的开始时间
	 */
	public static Date getDayBegin(Date date) {
		if(date==null)return null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}
	
	/**
	 * 获取某年的结束时间</br></br>
	 * 如2015年的结束时间为</br>
	 * 2016-01-01 00:00:00.000
	 * 
	 * @param date
	 * @return 某年的结束时间
	 */
	public static Date getYearEnd(Date date) {
		if(date==null)return null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getYearBegin(date));
		calendar.add(Calendar.YEAR, 1);
		return calendar.getTime();
	}
	
	/**
	 * 获取某月的结束时间</br></br>
	 * 如2015-04月的结束时间为</br>
	 * 2015-05-01 00:00:00.000
	 * 
	 * @param date
	 * @return 某月的结束时间
	 */
	public static Date getMonthEnd(Date date) {
		if(date==null)return null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getMonthBegin(date));
		calendar.add(Calendar.MONTH, 1);
		return calendar.getTime();
	}
	
	/**
	 * 获取某天的结束时间</br></br>
	 * 如2015-04-24 12:00:00的结束时间为</br>
	 * 2015-04-25 00:00:00.000
	 * 
	 * @param date
	 * @return 某天的结束时间
	 */
	public static Date getDayEnd(Date date) {
		if(date==null)return null;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(getDayBegin(date));
		calendar.add(Calendar.DATE, 1);
		return calendar.getTime();
	}
	
	/**
	 * 根据日期格式获取开始时间</br></br>
	 * 如2015-04-24 12:00:00对应的格式的开始时间为</br>
	 * yyyyMMdd => 2015-04-24 00:00:00.000</br>
	 * yyyyMM => 2015-04-01 00:00:00.000</br>
	 * yyyy => 2015-01-01 00:00:00.000
	 * 
	 * @param date
	 * @return 开始时间
	 */
	public static Date getBeginByFormat(String format, Date date) {
		if(format==null)
			return date;
		switch (format) {
		//获取年的起始、结束时间
		case "yyyy":
			return DateUtils.getYearBegin(date);
		//获取月的起始、结束时间
		case "yyyyMM":
			return DateUtils.getMonthBegin(date);
		//获取日的起始、结束时间
		case "yyyyMMdd":
			return DateUtils.getDayBegin(date);
		default:
			return date;
		}
	}
	
	/**
	 * 根据日期格式获取结束时间</br></br>
	 * 如2015-04-24 12:00:00对应的格式的开始时间为</br>
	 * yyyyMMdd => 2015-04-25 00:00:00.000</br>
	 * yyyyMM => 2015-05-01 00:00:00.000</br>
	 * yyyy => 2016-01-01 00:00:00.000
	 * 
	 * @param date
	 * @return 开始时间
	 */
	public static Date getEndByFormat(String format, Date date) {
		if(format==null)
			return date;
		switch (format) {
		//获取年的起始、结束时间
		case "yyyy":
			return DateUtils.getYearEnd(date);
		//获取月的起始、结束时间
		case "yyyyMM":
			return DateUtils.getMonthEnd(date);
		//获取日的起始、结束时间
		case "yyyyMMdd":
			return DateUtils.getDayEnd(date);
		default:
			return date;
		}
	}
	
	/**
     * 获得两个Date型日期之间相差的天数
     *
     * @param Date
     *                first, Date second
     * @return int 相差的天数
     */
    public static int getDaysBetweenDates(Date first, Date second) {
    	Long mils = 0L;
    	if(first.getTime() > second.getTime()) {
    		mils = (long)Math.ceil((first.getTime() - second.getTime()) / ((double)TIME_DAY_MILLISECOND));
    	} else if (first.getTime() < second.getTime()) {
    		mils = (long)Math.floor((first.getTime() - second.getTime()) / ((double)TIME_DAY_MILLISECOND));
    	} else {
    		return 0;
    	}
        return mils.intValue();
    }
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		////System.out.println("本日开始时间："+sdf.format(getDayBegin(new Date())));
		////System.out.println("本月开始时间："+sdf.format(getMonthBegin(new Date())));
		////System.out.println("本年开始时间："+sdf.format(getYearBegin(new Date())));
		////System.out.println("本日结束时间："+sdf.format(getDayEnd(new Date())));
		////System.out.println("本月结束时间："+sdf.format(getMonthEnd(new Date())));
		////System.out.println("本年结束时间："+sdf.format(getYearEnd(new Date())));
	}
}
