package dailyLeetcodeQuestions2024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumLengthOfConcatinatedStr {

	public static void main(String[] args) {
		List<String> strings=Arrays.asList("cha","r","act","ers");
		int maxLen=maximumLengthOfConcatinatedStringWithUniqueCharacters(strings);
		System.out.println(maxLen);
	}

	private static int maximumLengthOfConcatinatedStringWithUniqueCharacters(List<String> strings) {
		String temp="";
		int n=strings.size();
		int i=0;
		return recurse(i,strings,temp,n);
	}
	private static int recurse(int i, List<String> strings, String temp, int n) {
		if(i>=n)
			return temp.length();
		int include=0;
		int exclude=0;
		
		if(hasDuplicate(temp,strings.get(i))) {
			exclude=recurse(i+1,strings,temp,n);
		}
		else {
			exclude=recurse(i+1,strings,temp,n);
			include=recurse(i+1,strings,temp+strings.get(i),n);
		}
		return Math.max(include, exclude);
	}
	private static boolean hasDuplicate(String s1,String s2) {
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s2.length();i++) {
			if(!map.containsKey(s2.charAt(i)))
				map.put(s2.charAt(i), 1);
			else return true;
		}
		for(int i=0;i<s1.length();i++) {
			if(map.containsKey(s1.charAt(i)))
				return true;
		}
		return false;
	}

}
