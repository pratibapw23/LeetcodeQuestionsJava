package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class LongestNiceSubString {

	public static void main(String[] args) {
		String s = "Bb";
		String str=longestNiceSubstring(s);
		System.out.println(str);
	}

	private static String longestNiceSubstring(String s) {
		
		int maxlen=0;
		String st="";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String substr=s.substring(i, j);
				if(isNice(substr) && substr.length()>maxlen) {
					maxlen=substr.length();
					st=substr;
				}
			}
		}
		
		return st;
	}

	private static boolean isNice(String subSequence) {
		
		boolean lowercase[]=new boolean[26];
		boolean uppercase[]=new boolean[26];
		
		for(char c:subSequence.toCharArray()) {
			if(Character.isLowerCase(c)) {
				lowercase[c-'a']=true;
			}
			else if(Character.isUpperCase(c)) {
				uppercase[c-'A']=true;
			}
		}
		for(int i=0;i<26;i++) {
			if(lowercase[i]!=uppercase[i])
			{
				return false;
			}
		}
		return  true;
	}

}
