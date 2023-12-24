package com.leetcodeQuestions;

import java.util.HashMap;

public class PermutationInString {

	public static void main(String[] args) {
		
		String s1 = "ab", s2 = "eidboaoo";
		boolean result=isContainsPermutation(s1,s2);
		System.out.println(result);
	}

	private static boolean isContainsPermutation(String s1, String s2) {
		HashMap<Character, Integer> map1=new HashMap<>();
		HashMap<Character,Integer> map2=new HashMap<>();
		for(char i='a';i<='z';i++) {
			map1.put(i, 0);
			map2.put(i, 0);
		}
		for(int i=0;i<s1.length();i++) {
			map1.put(s1.charAt(i), map1.get(s1.charAt(i))+1);
		}
		int n=s1.length();
		for(int i=0;i<s2.length();i++) {
			map2.put(s2.charAt(i), map2.get(s2.charAt(i))+1);
			if(i>=n) {
				map2.put(s2.charAt(i-n), map2.get(s2.charAt(i-n))-1);
			}
			if(map1.equals(map2))
				return true;
		}
		System.out.println(map1+"\n"+map2);
		return false;
	}

}
