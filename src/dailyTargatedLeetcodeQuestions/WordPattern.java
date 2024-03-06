package dailyTargatedLeetcodeQuestions;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		String pattern="abba", s="dog dog dog dog";
		boolean res=wordPattern(pattern,s);
		System.out.println(res);
	}

	private static boolean wordPattern(String pattern, String s) {
		String strs[]=s.split(" ");
		char chrs[]=pattern.toCharArray();
		if(pattern.length()!=strs.length)
			return false;
		Map<Character,String> map=new HashMap<>();
		for(int i=0;i<strs.length;i++) {
			if(map.containsKey(chrs[i])) {
				if((!map.get(chrs[i]).equals(strs[i]))) {
					return false;
				}
			}
			else {
				if(map.containsValue(strs[i]))
					return false;
			}
			map.put(chrs[i], strs[i]);
		}
		System.out.println(map);
		return true;
	}

}
