package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowelsOfString {

	public static void main(String[] args) {
		String s="leetcode";
		String str=reverseVowelsOfAString(s);
		System.out.println(str);
	}

	private static String reverseVowelsOfAString(String s) {
		String vowels = "aeiouAEIOU";
		char[] chars=s.toCharArray();
		int left=0,right=chars.length-1;
		while(left<right) {
			while(left<right && vowels.indexOf(chars[left])==-1) {
			left++;
			}
			while(left<right && vowels.indexOf(chars[right])==-1)
			{
			right--;
			}
			char temp=chars[left];
			chars[left]=chars[right];
			chars[right]=temp;
			
			left++;right--;
		}
//		System.out.println(Arrays.toString(chars));
		String ans=new String(chars);
		return ans;
	}

}
