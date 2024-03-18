package dailyTargatedLeetcodeQuestions;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveLetterToEqualizeFrequency {

	public static void main(String[] args) {
		String word="mmkkkttrr";
		boolean res=removeLetterToEqualizeFrequency(word);
		System.out.println(res);

	}

	private static boolean removeLetterToEqualizeFrequency(String word) {
		Map<Character,Integer> map=new HashMap<>();
		Set<Integer> set=new HashSet<>();
//		Set<Integer> set=new HashSet<>();
		for(int i=0;i<word.length();i++) {
			if(!map.containsKey(word.charAt(i))) map.put(word.charAt(i), 1);
			else map.put(word.charAt(i), map.get(word.charAt(i))+1);
		}
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			set.add(entry.getValue());
		}
		int max=Collections.max(set);
		int minus=max-1;
		
		System.out.println(max);
		return false;
	}

	

}
