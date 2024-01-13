package dailyLeetcodeQuestions2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HalvesAreAlike {

	public static void main(String[] args) {
		String s="book";
		boolean res=halvesAreAlike(s);
		System.out.println(res);
	}

	private static boolean halvesAreAlike(String s) {
		List<Character> ovels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
		
		int mid=s.length()/2;
		int n=s.length();
		StringBuilder str1=new StringBuilder();
		StringBuilder str2=new StringBuilder();
		for(int i=0;i<mid;i++)
			str1.append(s.charAt(i));
		for(int i=mid;i<n;i++)
			str2.append(s.charAt(i));
		System.out.println(str1+" "+str2);
		
		int count1=0,count2=0;
		for(int i=0;i<str1.length();i++) {
			if(ovels.contains(str1.charAt(i)))
				count1++;
		}
		for(int i=0;i<str2.length();i++) {
			if(ovels.contains(str2.charAt(i)))
				count2++;
		}
		return count1==count2;
	}

}
