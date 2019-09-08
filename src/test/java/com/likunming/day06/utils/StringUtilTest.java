/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StringUtilTest.java 
 * @Prject: likunming-day06
 * @Package: com.likunming.day06.utils 
 * @Description: TODO
 * @author: tv   
 * @date: 2019年9月7日 下午2:26:52 
 * @version: V1.0   
 */
package com.likunming.day06.utils;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

/** 
 * @ClassName: StringUtilTest 
 * @Description: TODO
 * @author: 李坤明
 * @date: 2019年9月7日 下午2:26:52  
 */
public class StringUtilTest {

	/**
	 * Test method for {@link com.likunming.day06.utils.StringUtil#hasLength(java.lang.String)}.
	 */
	@Test
	public void testHasLength() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.likunming.day06.utils.StringUtil#hasText(java.lang.String)}.
	 */
	@Test
	public void testHasText() {
		fail("Not yet implemented");
	}

	@Test
	public void testRandomChineseString() throws UnsupportedEncodingException {
		String string = StringUtil.randomChineseString();
		System.out.println(string);
	}

	/**
	 * Test method for {@link com.likunming.day06.utils.StringUtil#generateChineseName()}.
	 */
	@Test
	public void testGenerateChineseName() {
		fail("Not yet implemented");
	}

}
