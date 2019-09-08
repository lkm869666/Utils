/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtil.java 
 * @Prject: likunming-day06
 * @Package: com.likunming.day06.utils 
 * @Description: TODO
 * @author: tv   
 * @date: 2019年9月5日 上午10:27:18 
 * @version: V1.0   
 */
package com.likunming.day06.utils;

import java.util.Calendar;
import java.util.Date;

/** 
 * @ClassName: DateUtil 
 * @Description: TODO
 * @author: 李坤明
 * @date: 2019年9月5日 上午10:27:18  
 */
public class DateUtil {
	
	/*
	* 方法1：(5分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		
//		用当前系统时间获取日历类
		Calendar calendar = Calendar.getInstance();
		
//		给传入的变量初始化日历类
		calendar.setTime(src);
		calendar.set(Calendar.DAY_OF_MONTH, 1);//MONTH	月
		calendar.set(Calendar.HOUR_OF_DAY, 0);//HOUR	小时
		calendar.set(Calendar.MINUTE, 0);//MINUTE		分
		calendar.set(Calendar.SECOND, 0);//SECOND		秒
		
		return calendar.getTime();
	}
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		
//		用当前系统时间获取日历类
		Calendar c = Calendar.getInstance();
//		用传入的变量初始化日历类
		c.setTime(src);
		
//		让月份加1
		c.add(Calendar.MONTH, 1);
//		让月份变成月初
		Date date = getDateByInitMonth(c.getTime());
//		再用月初初始化日历类
		c.setTime(date);
//		让秒减一
		c.add(Calendar.SECOND, -1);
		
		return c.getTime();
	}
	
}
