package dailyTargatedLeetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestPalindromSubstring {

	public static void main(String[] args) {
		String s="caba";
		String str=lengthOfLongestPalindromSubstring(s);
		System.out.println(str);
	}

	private static String lengthOfLongestPalindromSubstring(String s) {
		if(s.length()<=1) return s;
		int maxlen=1;
		int st=0;
		int end=0;
		int n=s.length();
		
			for(int i=0;i<n-1;i++) {
				int left=i,right=i;
				while(left>=0 && right<n) {
					if(s.charAt(left)==s.charAt(right)) {
						left--;
						right++;
					}
					else
						break;
				}
				int len=right-left-1;
				if(len>maxlen) {
					maxlen=len;
					st=left+1;
					end=right-1;
				}
			}
			for(int i=0;i<n-1;i++) {
				int left=i,right=i+1;
				while(left>=0 && right<n) {
					if(s.charAt(left)==s.charAt(right)) {
						left--;right++;
					}
					else
						break;
				}
				int len=right-left-1;
				if(len>maxlen) {
					maxlen=len;
					st=left+1;
					end=right-1;
				}
			}
		return s.substring(st,end+1);
		 
	}

}
