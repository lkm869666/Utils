/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StreamUtilTest.java 
 * @Prject: likunming-day06
 * @Package: com.likunming.day06.utils 
 * @Description: TODO
 * @author: tv   
 * @date: 2019年9月6日 下午12:05:12 
 * @version: V1.0   
 */
package com.likunming.day06.utils;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

import com.likunming.common.utils.StreamUtil;

/** 
 * @ClassName: StreamUtilTest 
 * @Description: TODO
 * @author: 李坤明
 * @date: 2019年9月6日 下午12:05:12  
 */
public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		
		
		
	}

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		
		String string = StreamUtil.readTextFile(new FileInputStream("e:/test.txt"));
		
		System.out.println(string);
		
	}

	@Test
	public void testReadTextFileFile() {
		fail("Not yet implemented");
	}

}
