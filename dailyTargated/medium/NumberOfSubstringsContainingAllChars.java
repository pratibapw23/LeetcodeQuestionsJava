package dailyTargated.medium;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubstringsContainingAllChars {

	public static void main(String[] args) {
		String s = "aaacb";
		int count=numberOfSubstringsContainingAllCharacters(s);
		System.out.println(count);
	}

	private static int numberOfSubstringsContainingAllCharacters(String s) {
//		int count=0;
//		for(int i=0;i<s.length();i++) {
//			for(int j=i+1;j<=s.length();j++) {
//				if(checkAllChars(s.substring(i, j))) {
//					count++;
//				}
//			}
//		}
//		return count;
		
		Map<Character, Integer> map=new HashMap<>();
		int count=0;
		int j=0;
		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
			
			while(map.size()==3) {
				count+=s.length()-i;
				map.put(s.charAt(j), map.get(s.charAt(j))-1);
				if(map.get(s.charAt(j))==0) {
					map.remove(s.charAt(j));
				}
				j++;
			}
		}
		return count;
	}

//	public static boolean checkAllChars(String substring) {
//		Map<Character,Integer> map=new HashMap<>();
//		map.put('a', 0);map.put('b', 0);map.put('c', 0);
//		for(int i=0;i<substring.length();i++) {
//			if(map.containsKey(substring.charAt(i))) {
//				map.put(substring.charAt(i), 1);
//			}
//		}
//		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
//			if(entry.getValue()<=0) return false;
//		}
//		return true;
//	}

}
