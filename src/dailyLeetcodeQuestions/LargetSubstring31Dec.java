package dailyLeetcodeQuestions;

import java.util.HashMap;
import java.util.Map;

public class LargetSubstring31Dec {

	public static void main(String[] args) {
		String s="aydsicwrfybunpqsdsnenvrfirr";
		int len=largestSubstringBetweenTwoEqualCharacters(s);
		System.out.println(len);
	}

	private static int largestSubstringBetweenTwoEqualCharacters(String s) {
		int maxlen=-1;
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				maxlen=Math.max(maxlen, (i-map.get(s.charAt(i))-1));
			}
			else {
				map.put(s.charAt(i), i);
			}
		}
		return maxlen;
	}

}
