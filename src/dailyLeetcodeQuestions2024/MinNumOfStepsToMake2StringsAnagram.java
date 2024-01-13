package dailyLeetcodeQuestions2024;

import java.util.HashMap;
import java.util.Map;

public class MinNumOfStepsToMake2StringsAnagram {

	public static void main(String[] args) {
		
		String s = "anagram", t = "mangaar";
		int steps=minStepsToMakeTwoSttringsAnagram(s,t);
		System.out.println(steps);

	}

	private static int minStepsToMakeTwoSttringsAnagram(String s, String t) {
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(!map.containsKey(s.charAt(i))) map.put(s.charAt(i), 1);
			else map.put(s.charAt(i), map.get(s.charAt(i))+1);
		}
//		System.out.println(map);
		for(int i=0;i<t.length();i++) {
			if(map.containsKey(t.charAt(i))) {
				map.put(t.charAt(i), map.get(t.charAt(i))-1);
			}
		}
		int cnt=0;
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()>=0) {
				cnt+=entry.getValue();
			}
		}
		System.out.println(map);
		return cnt;
	}

}
