package com.leetcodeQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class IsomorphicStrings {

	public static void main(String[] args) {
		String s = "foo", t = "bar";
		boolean result=isIsomorphic(s,t);
		System.out.println(result);
	}

	private static boolean isIsomorphic(String s, String t) {
		if(s.length()!=t.length())
			return false;
		
		Map<Character,Integer> map1=new LinkedHashMap<>();
		Map<Character,Integer> map2=new LinkedHashMap<>();
		
		for(Integer i=0;i<s.length();i++) {
			if(map1.put(s.charAt(i), i) != map2.put(t.charAt(i), i))
				return false;
		}
		
		return true;
	}

}
