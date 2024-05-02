package dailyTargated.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheDifference {

	public static void main(String[] args) {
		String s = "a", t = "aa";
		char c=findTheDifference(s,t);
		System.out.println(c);
	}

	private static char findTheDifference(String s, String t) {
		if(s.length()<=0 && t.length()==1)
			return t.charAt(0);
		Map<Character,Integer> map=new HashMap<>();
		Map<Character,Integer> map2=new HashMap<>();
		for(char c:s.toCharArray()) {
			if(!map.containsKey(c)) map.put(c, 1);
			else map.put(c, map.get(c)+1);
		}
		for(char c:t.toCharArray()) {
			if(!map2.containsKey(c)) map2.put(c, 1);
			else map2.put(c, map2.get(c)+1);
		}
		for(int i=0;i<t.length();i++) {
			if(map.containsKey(t.charAt(i))) {
				if(map.get(t.charAt(i))!=map2.get(t.charAt(i)))
					return t.charAt(i);
			}
			else if(!map.containsKey(t.charAt(i)))
				return t.charAt(i);
		}
		return 0;
	}

}
