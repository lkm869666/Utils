/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: FileUtilTest.java 
 * @Prject: likunming-day06
 * @Package: com.likunming.day06.utils 
 * @Description: TODO
 * @author: tv   
 * @date: 2019年9月6日 上午11:42:49 
 * @version: V1.0   
 */
package com.likunming.day06.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import com.likunming.common.utils.FileUtil;

/** 
 * @ClassName: FileUtilTest 
 * @Description: TODO
 * @author: 李坤明
 * @date: 2019年9月6日 上午11:42:49  
 */
public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		
		String str = "test.txt";
		
		String string = FileUtil.getExtendName(str);
		
		System.out.println(string);
	}
	
	@Test
	public void testGetTempDirectory() {
		
		File file = FileUtil.getTempDirectory();
		
		System.out.println(file);
	}
	
	@Test
	public void testGetUserDirectory() {
		
		File file = FileUtil.getUserDirectory();
		
		System.out.println(file);
	}
	
}
