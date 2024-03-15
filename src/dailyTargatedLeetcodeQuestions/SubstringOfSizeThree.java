package dailyTargatedLeetcodeQuestions;

import java.util.HashSet;
import java.util.Set;

public class SubstringOfSizeThree {

	public static void main(String[] args) {
		String s = "aababcabc";
		int count=substringOfSizeThreeWithDistinctChars(s);
		System.out.println(count);
	}

	private static int substringOfSizeThreeWithDistinctChars(String s) {
		int count=0;
		Set<Character> set=new HashSet<>();
		int i=0;
		int j=0;
		int counter=0;
		char ch[]=s.toCharArray();
		if(ch.length<=2) return 0;
		while(i!=ch.length-2) {
			set.add(ch[j]);
			j++; counter++;
			if(counter==3) {
				if(set.size()==3) {
					count++;
					counter=0;
				}
				else counter=0;
				i++;
				set.clear();
				j=i;
			}
			
		}
		return count;
	}


}
