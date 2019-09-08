/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: RandomUtil.java 
 * @Prject: likunming-day06
 * @Package: com.likunming.day06.utils 
 * @Description: TODO
 * @author: tv   
 * @date: 2019年9月7日 下午12:47:45 
 * @version: V1.0   
 */
package com.likunming.day06.utils;

import java.util.HashSet;
import java.util.Random;

/** 
 * @ClassName: RandomUtil 
 * @Description: TODO
 * @author: 李坤明
 * @date: 2019年9月7日 下午12:47:45  
 */
public class RandomUtil {
	
	public static int random(int min, int max) {
		
		Random r = new Random();
		
		int i = r.nextInt(max - min + 1) +min;
		
		return i;
	}
	
	public static int[] subRandom(int min, int max, int subs) {
//		创建要截取的随机的个数的数组
		int[] arr = new int[subs];
		
		HashSet<Integer> set = new HashSet<Integer>(subs);
		
		while(set.size() != subs) {
			
			set.add(random(min, max));
			
		}
		
		int j = 0;
		for (Integer integer : set) {
			arr[j] = integer;
			j++;
		}
		
		return arr;
	}
	
	public static char randomCharacter() {
		
		String str = "123456789fjfioaevhviuhrfuhAFIOHGEZRHIESAHIG";
		
		char c = str.charAt(random(0, str.length()-1));
		
		return c;
	}
	
	public static String randomString(int length) {
		
		String str = "";
		
		for (int i = 0; i < length; i++) {
			str += randomCharacter();
		}
		
		return str;
	}
}
