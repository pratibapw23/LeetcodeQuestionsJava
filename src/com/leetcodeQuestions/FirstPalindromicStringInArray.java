package com.leetcodeQuestions;

public class FirstPalindromicStringInArray {

	public static void main(String[] args) {
		String words[]= {"abc","car","ada","racecar","cool"};
		String str=firstpalindromicString(words);
		System.out.println(str);
	}

	private static String firstpalindromicString(String[] words) {
		for(int i=0;i<words.length;i++) {
			String str=words[i];
			StringBuilder rev=new StringBuilder(str);
			rev.reverse();
			if(str.equals(rev.toString()))
				return str;
		}
		
		return "";
	}

}
