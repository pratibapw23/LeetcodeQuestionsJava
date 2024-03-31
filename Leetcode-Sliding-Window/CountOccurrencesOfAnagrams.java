package dailyTargatedLeetcodeQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesOfAnagrams {

	public static void main(String[] args) {
		String str="forxxorfxdofr";
		String pat="for";
		int count=countOccurrencesofAnagrams(str,pat);
		System.out.println(count);
	}

	private static int countOccurrencesofAnagrams(String str, String pat) {
		Map<Character,Integer> map=new HashMap<>();
		int i=0,j=0;
		int ans=0;
		int n=str.length();
		for(int i1=0;i1<pat.length();i1++) {
			map.put(pat.charAt(i1), map.getOrDefault(pat.charAt(i1), 0)+1);
		}
		System.out.println(map);
		while(j<n) {
			if(map.containsKey(str.charAt(j)))
				map.put(str.charAt(j), map.get(str.charAt(j))-1);
			int winsize=j-i+1;
			if(winsize==pat.length()) {
				if(allzeros(map)) {
					ans++;
				}
				if(map.containsKey(str.charAt(i)))
					map.put(str.charAt(i), map.get(str.charAt(i))+1);
				i++;
			}
			j++;
		}
		return ans;
	}

	private static boolean allzeros(Map<Character, Integer> map) {
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()>0)
				return false;
		}
		return true;
	}

}
