package dailyTargated.easy;

import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {

	public static void main(String[] args) {
		String licensePlate = "1s3 PSt";
		String words[] = {"step","steps","stripe","stepple"};
		String word=shortestCompletingWord(licensePlate,words);
		System.out.println(word);
	}

	private static String shortestCompletingWord(String licensePlate, String[] words) {
		Map<Character,Integer> map=new HashMap<>();
		int count=0;
		for(int i=0;i<licensePlate.length();i++) {
			if(!Character.isDigit(licensePlate.charAt(i)) && !Character.isSpace(licensePlate.charAt(i))) {
				if(!map.containsKey(Character.toLowerCase(licensePlate.charAt(i)))) map.put(Character.toLowerCase(licensePlate.charAt(i)), 1);
				else map.put(Character.toLowerCase(licensePlate.charAt(i)), map.get(Character.toLowerCase(licensePlate.charAt(i)))+1);
				count++;
			}
		}
		String minstr = null;
		for(String word:words) {
			
			Map<Character,Integer> curr=new HashMap<>(map);
			int newcnt=count;
			for(char ch:word.toCharArray()) {
				ch=Character.toLowerCase(ch);
				if(curr.containsKey(ch)) {
					newcnt--;
					curr.put(ch, curr.get(ch)-1);
					if(curr.get(ch)==0) {
						curr.remove(ch);
					}
				}
			}
			if(newcnt==0 && (minstr==null || word.length()<minstr.length())) {
				minstr=word;
			}
		}
		System.out.println(map);
		return minstr;
	}

}
