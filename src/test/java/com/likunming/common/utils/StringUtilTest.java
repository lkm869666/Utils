/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StringUtilTest.java 
 * @Prject: likunming-common
 * @Package: com.likunming.common.utils 
 * @Description: TODO
 * @author: tv   
 * @date: 2019年9月9日 上午9:09:56 
 * @version: V1.0   
 */
package com.likunming.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @ClassName: StringUtilTest 
 * @Description: TODO
 * @author: 李坤明
 * @date: 2019年9月9日 上午9:09:56  
 */
public class StringUtilTest {
	
	/**
	 * 
	 * @Title: testToHtml 
	 * @Description: 测试toHtml()
	 * @return: void
	 */
	@Test
	public void testToHtml() {
		String[] html = StringUtil.toHtml("哈哈哈哈哈哈\n哈哈\n哈哈哈哈");
		for (String string : html) {
			System.out.println(string);
		}
	}

	/**
	 * 
	 * @Title: testIsPhoneNumber 
	 * @Description: 测试是否为手机号
	 * @return: void
	 */
	 
	@Test
	public void testIsPhoneNumber() {
		
		boolean b = StringUtil.isPhoneNumber("13563147251");
		
		if(b) {
			System.out.println("该手机号合法");
		}else {
			System.out.println("该手机号不合法");
		}
	}

	/**
	 * 
	 * @Title: testIsEmail 
	 * @Description: 测试是否为邮箱
	 * @return: void
	 */
	 
	@Test
	public void testIsEmail() {
		
		boolean b = StringUtil.isEmail("lkm869666@126.com");
		
		if(b) {
			System.out.println("该邮箱合法");
		}else {
			System.out.println("该邮箱不合法");
		}
		
	}

}
