/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtilTest.java 
 * @Prject: likunming-day06
 * @Package: com.likunming.day06.utils 
 * @Description: TODO
 * @author: tv   
 * @date: 2019年9月5日 上午10:53:20 
 * @version: V1.0   
 */
package com.likunming.day06.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/** 
 * @ClassName: DateUtilTest 
 * @Description: TODO
 * @author: 李坤明
 * @date: 2019年9月5日 上午10:53:20  
 */
public class DateUtilTest {

	@Test
	public void getDateByInitMonth() {
		
		Calendar c = Calendar.getInstance();
		
		c.set(2000, 1, 8);
		
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(format.format(date));
		
	}
	
	@Test
	public void getDateByFullMonth() {
		
		Calendar c = Calendar.getInstance();
		
		c.set(2019, 1, 8);
		
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(format.format(date));
		
	}
}
