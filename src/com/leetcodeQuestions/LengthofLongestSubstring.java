package com.leetcodeQuestions;

import java.util.HashSet;

public class LengthofLongestSubstring {

	public static void main(String[] args) {
		String s = "abcabbb";
		int len=findLengthOfLongestSubstring(s);
		System.out.println(len);
	}

	private static int findLengthOfLongestSubstring(String s) {
		HashSet<Character> set=new HashSet<>();
		int max=0;
		int left=0;
		for(int right=0;right<s.length();right++) {
			if(!set.contains(s.charAt(right))) {
				set.add(s.charAt(right));
				max=Math.max(max, right-left+1);
			}
			else {
				while(set.contains(s.charAt(right))) {
					set.remove(s.charAt(left));
					left++;
				}
				set.add(s.charAt(right));
			}
		}
		return max;

}
}
