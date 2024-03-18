package dailyTargatedLeetcodeQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class VerifyingAlienDictionery {

	public static void main(String[] args) {
		String order="worldabcefghijkmnpqstuvxyz";
		String words[]= {"word","world","row"};
		boolean verify=verifyAnAlienDictionery(words,order);
		System.out.println(verify);
	}

	private static boolean verifyAnAlienDictionery(String[] words, String order) {
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<order.length();i++) {
			map.put(order.charAt(i), i);
		}
		System.out.println(map);
		for(int i=0;i<words.length;i++) {
			String str1=words[i];
			String str2=words[i+1];
			int minlen=Math.min(str1.length(), str2.length());
			for(int j=0;j<minlen;j++) {
				if(map.get(str1.charAt(j))>map.get(str2.charAt(j))) {
					return false;
				}
			}
		}
		return true;
	}

}
