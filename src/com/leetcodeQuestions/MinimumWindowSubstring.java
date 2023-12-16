package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

	public static void main(String[] args) {
		String s = "ADOBECODEBANC", t = "ABC";
		String substring = minimumWindowSubstring(s, t);
		System.out.println(substring);
	}
	private static String minimumWindowSubstring(String s, String t) {
		Map<Character,Integer> map=new HashMap<>();
		ArrayList<String> list=new ArrayList<>();
		for(int i=0;i<t.length();i++) {
			if(!map.containsKey(t.charAt(i))) {
				map.put(t.charAt(i), 1);
			}
			else {
				int val=map.get(t.charAt(i));
				map.put(t.charAt(i), val+1);
			}
		}
		int left=0,count=0,min=Integer.MAX_VALUE, minleft=0;
		for(int right=0;right<s.length();right++) {
			if(map.containsKey(s.charAt(right))) {
				int val=map.get(s.charAt(right));
				map.put(s.charAt(right), val-1);
				if(map.get(s.charAt(right))>=0) {
					count++;
			}
			}
			while(count==t.length()) {
					if(min>=right-left+1) {
						min=right-left+1;
						minleft=left;
					}
				if(map.containsKey(s.charAt(left))) {
					int v=map.get(s.charAt(left));
					map.put(s.charAt(left), v+1);
					if(map.get(s.charAt(left))>0)
						count--;
				}
				left++;
			}
		}
		if(min>s.length()) return "";
	return s.substring(minleft,minleft+min);

}
}
