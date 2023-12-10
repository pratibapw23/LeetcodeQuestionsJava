package com.leetcodeQuestions;

import java.util.Arrays;

public class RotateString {

	public static void main(String[] args) {
		String s = "abcde", goal = "abced";
		boolean result=rotateString(s,goal);
		System.out.println(result);
	}

	private static boolean rotateString(String s, String goal) {
		if(s.length()!=goal.length())
			return false;
		String s1=s+s;
		if(s1.contains(goal))
			return true;
		return false;
	}

}
