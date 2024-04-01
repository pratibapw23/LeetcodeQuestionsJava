package dailyLeetcodeQuestions2024;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s = "   fly me   to   the moon  ";
		int len=lengthOfLastWord(s);
		System.out.println(len);
	}

	private static int lengthOfLastWord(String s) {
		s=s.trim();
		System.out.println(s);
		int i=s.length()-1;
		StringBuffer str=new StringBuffer();
		while(i<s.length() && i>=0) {
			if(s.charAt(i)==' ')
				break;
			str.append(s.charAt(i));
			i--;
		}
		System.out.println(str);
		return str.toString().length();
	}

}
