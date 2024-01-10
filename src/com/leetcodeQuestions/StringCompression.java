package com.leetcodeQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringCompression {

	public static void main(String[] args) {
		
		char ch[]= {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
		int len=stringCompress(ch);
		System.out.println(len);
	}

	private static int stringCompress(char[] ch) {
		
		int index=0;
		
		for(int i=0;i<ch.length;) {
			final char c=ch[i];
			int count=0;
			
			while(i<ch.length && ch[i]==c) {
				++count;
				++i;
			}
			ch[index++]=c;
			
			if(count>1) {
				for(char chh:String.valueOf(count).toCharArray()) {
					ch[index++]=chh;
				}
			}
		}
		return index;
	}

}
