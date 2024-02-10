package dailyLeetcodeQuestions2024;

import java.util.ArrayList;
import java.util.List;

public class PalindromicSubstrings {

	public static void main(String[] args) {
		String s = "aaa";
		int count=palindromicSubstrings(s);
		System.out.println(count);
	}

	private static int palindromicSubstrings(String s) {
		List<String> list=new ArrayList<>();
		
		StringBuilder str;
		for(int i=0;i<s.length();i++) {
			str=new StringBuilder().append(s.charAt(i));
			list.add(str.toString());
			for(int j=i+1;j<s.length();j++) {
				str.append(s.charAt(j));
				list.add(str.toString());
			}
		}
		System.out.println(list);
		int count=0;
		for(String s2:list) {
			StringBuilder s3=new StringBuilder(s2);
			if(s3.reverse().toString().equals(s2)) {
				count++;
			}
		}
		return count;
	}

}
