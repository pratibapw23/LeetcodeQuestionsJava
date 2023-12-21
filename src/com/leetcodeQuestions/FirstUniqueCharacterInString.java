package com.leetcodeQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

	public static void main(String[] args) {
		String s = "dddccdbba";
		int index=findFirstUniqueCharacter(s);
		System.out.println(index);
	}

	private static int findFirstUniqueCharacter(String s) {
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			}
			else {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
		}
		int index=-1;
		char ch = 0;
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				ch=entry.getKey();
				break;
			}
		}
		System.out.println(ch);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				index=i;
				break;
			}
				
		}
		return index;
	}

}
