package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtraordenerySubstrings {

	public static void main(String[] args) {
		String s="nrqqigtqph";
		int cnt=extraordenerySubstrings(s);
		System.out.println(cnt);
	}

	private static int extraordenerySubstrings(String s) {
		Map<Integer, List<Character>> map=new HashMap<>();
		
		map.put(1, Arrays.asList('a','b'));
		map.put(2, Arrays.asList('c','d','e'));
		map.put(3, Arrays.asList('f','g','h'));
		map.put(4, Arrays.asList('i','j','k'));
		map.put(5, Arrays.asList('l','m','n'));
		map.put(6, Arrays.asList('o','p','q'));
		map.put(7, Arrays.asList('r','s','t'));
		map.put(8, Arrays.asList('u','v','w'));
		map.put(9, Arrays.asList('x','y','z'));
		
		List<String> substrings=new ArrayList<>();
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				substrings.add(s.substring(i, j));
			}
		}
		System.out.println(substrings);
		int count=0;
		for(String str:substrings) {
			int currlen=str.length();
			
				int sum=0;
				for(Map.Entry<Integer, List<Character>> entry:map.entrySet()) {
					char charr[]=str.toCharArray();
						for(char c:entry.getValue()) {
							for(int i=0;i<charr.length;i++) {
							if(c==charr[i]) {
								sum+=entry.getKey();
							}
						}
					}
					
				}
				if(sum%currlen==0) {
					count++;
				}
		}
		return count;
	}

}
