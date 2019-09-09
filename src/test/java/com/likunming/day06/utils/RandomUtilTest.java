/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: RandomUtilTest.java 
 * @Prject: likunming-day06
 * @Package: com.likunming.day06.utils 
 * @Description: TODO
 * @author: tv   
 * @date: 2019年9月7日 下午1:22:17 
 * @version: V1.0   
 */
package com.likunming.day06.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import com.likunming.common.utils.RandomUtil;

/** 
 * @ClassName: RandomUtilTest 
 * @Description: TODO
 * @author: 李坤明
 * @date: 2019年9月7日 下午1:22:17  
 */
public class RandomUtilTest {

	@Test
	public void testRandom() {
		for (int i = 0; i < 10; i++) {
			int j = RandomUtil.random(1, 3);
			System.out.println(j);
		}
		
	}

	@Test
	public void testSubRandom() {
		
		int[] subRandom = RandomUtil.subRandom(1, 10, 3);
		for (int i : subRandom) {
			System.out.println(i);
		}
		
	}

	@Test
	public void testRandomCharacter() {
		
		char c = RandomUtil.randomCharacter();
		
		System.out.println(c);
		
	}

	@Test
	public void testRandomString() {
		String string = RandomUtil.randomString(4);
		
		System.out.println(string);
	}

}
