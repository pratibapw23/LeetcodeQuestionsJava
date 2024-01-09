package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters {

	public static void main(String[] args) {
		
		String words[] = {"cool","lock","cook"};
		List<String> chars=findCommonCharacters(words);
		System.out.println(chars);

	}

	private static List<String> findCommonCharacters(String[] words) {
		
		List<HashMap<Character, Integer>> list=new ArrayList<>();
		List<String> mainlist=new ArrayList<>();
		for(int i=0;i<words.length;i++) {
			Map<Character,Integer> map=new HashMap<>();
			char ch[]=words[i].toCharArray();
			for(int j=0;j<ch.length;j++) {
				if(!map.containsKey(ch[j])) {
					map.put(ch[j], 1);
				}
				else {
					map.put(ch[j], map.get(ch[j])+1);
				}
				
			}
			list.add(new HashMap<Character,Integer>(map));
			
		}
		
		
		for(char ch:list.get(0).keySet()) {
			int min=Integer.MAX_VALUE;
			for(HashMap<Character, Integer> map:list) {
				if(!map.containsKey(ch)) {
					min=0;
					break;
				}
				min=Math.min(min, map.get(ch));
			}
			for(int i=0;i<min;i++) {
				mainlist.add(String.valueOf(ch));
			}
		}
        
		
		return mainlist;
	}

}
