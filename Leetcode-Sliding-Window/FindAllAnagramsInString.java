package dailyTargatedLeetcodeQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInString {

	public static void main(String[] args) {
		String s = "cbaebabacd", p = "abc";
		List<Integer> list=findAllAnagramsInString(s,p);
		System.out.println(list);
	}

	private static List<Integer> findAllAnagramsInString(String s, String p) {
		List<Integer> list=new ArrayList<>();
		Map<Character,Integer> map=new HashMap<>();
		int i=0,j=0;
		int n=s.length();
		for(int k=0;k<p.length();k++) {
			map.put(p.charAt(k), map.getOrDefault(p.charAt(k), 0)+1);
		}
//		System.out.println(map);
		while(j<n) {
			if(map.containsKey(s.charAt(j)))
				map.put(s.charAt(j), map.get(s.charAt(j))-1);
			if(j-i+1==p.length()) {
				if(allzeros(map)) {
					list.add(i);
				}
				if(map.containsKey(s.charAt(i)))
					map.put(s.charAt(i), map.get(s.charAt(i))+1);
				i++;
			}
			j++;
		}
		return list;
	}

	private static boolean allzeros(Map<Character, Integer> map) {
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()>0)
				return false;
		}
		return true;
	}

}
