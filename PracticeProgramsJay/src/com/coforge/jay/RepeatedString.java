package com.coforge.jay;

import java.util.HashMap;
import java.util.Map;

public class RepeatedString {
	
	public static Map<String, Integer> findRepeatedString(String str) {
		String[] split = str.split(" ");
		int length = split.length;
		Map<String,Integer> map = new HashMap<>();
		
		for(int i=0;i<length;i++) {
			if(map.containsKey(split[i])) {
				int count = map.get(split[i]);
				map.put(split[i], count+1);
			}else {
				map.put(split[i], 1);
			}
		}
		return map;
		
	}

	public static void main(String[] args) {
		Map<String, Integer> findRepeatedString = findRepeatedString("abc abc aa bb cc dd aa dd");
		System.out.println(findRepeatedString);
	}

}
