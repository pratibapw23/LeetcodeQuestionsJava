package com.leetcodeQuestions;

import java.util.Arrays;

public class IndexOfFirstOccurrenceInString {

	public static void main(String[] args) {
		String haystack = "sadbutsad", needle = "sad";
		int index=indexOfFirstOccurrenceInString(haystack,needle);
		System.out.println(index);
	}

	private static int indexOfFirstOccurrenceInString(String haystack, String needle) {
		if(haystack.contains(needle)) {
			return haystack.indexOf(needle);
		}
		return -1;
	}

}
