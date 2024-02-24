package dailyTargatedLeetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class CountTheNumOfConsistentStrings {

	public static void main(String[] args) {
		String allowed="cad";
		String words[]= {"cc","acd","b","ba","bac","bad","ac","d"};
		int count=countTheNumberOfConsistentStrings(allowed,words);
		System.out.println(count);
	}

	private static int countTheNumberOfConsistentStrings(String allowed, String[] words) {
		
		List<Character> list=new ArrayList<>();
		for(char ch:allowed.toCharArray())
			list.add(ch);
		
		int count=0;
		outerloop:
		for(int i=0;i<words.length;i++) {
			String str=words[i];
			for(int j=0;j<str.length();j++) {
				if(!list.contains(str.charAt(j))) {
					continue outerloop;
				}
			}
			count++;
		}
//		System.out.println(count);
		return count;
	}

}
