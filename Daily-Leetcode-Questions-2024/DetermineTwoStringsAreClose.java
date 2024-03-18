package dailyLeetcodeQuestions2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DetermineTwoStringsAreClose {

	public static void main(String[] args) {
		String s1="a", s2="aa";
		boolean res=checkTwoStringsAreClose(s1,s2);
		System.out.println(res);
		
	}

	private static boolean checkTwoStringsAreClose(String s1, String s2) {
		if(s1.length()!=s2.length())
			return false;
		Set<Character> set1=new HashSet<>();
		Set<Character> set2=new HashSet<>();
		Map<Character,Integer> map1=new HashMap<>();
		Map<Character,Integer> map2=new HashMap<>();
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		for(int i=0;i<s1.length();i++)
			set1.add(s1.charAt(i));
		for(int i=0;i<s2.length();i++)
			set2.add(s2.charAt(i));
		if(!set1.equals(set2))
			return false;
		for(int i=0;i<s1.length();i++) {
			if(!map1.containsKey(s1.charAt(i))) map1.put(s1.charAt(i), 1);
			else map1.put(s1.charAt(i), map1.get(s1.charAt(i))+1);
		}
		for(int i=0;i<s2.length();i++) {
			if(!map2.containsKey(s2.charAt(i))) map2.put(s2.charAt(i), 1);
			else map2.put(s2.charAt(i), map2.get(s2.charAt(i))+1);
		}
		for(Map.Entry<Character, Integer> entry:map1.entrySet()) {
			list1.add(entry.getValue());
		}
		for(Map.Entry<Character, Integer> entry:map2.entrySet()) {
			list2.add(entry.getValue());
		}
		Collections.sort(list1);
		Collections.sort(list2);
		if(!list1.equals(list2))
			return false;
		return true;
	}

}
