package dailyTargatedLeetcodeQuestions;

import java.util.Stack;

public class RemoveAllAdjucentDuplicatesInString {

	public static void main(String[] args) {
		String str="abbaca";
		String finalstr=removeAllAdjucentDuplicatesInString(str);
		System.out.println(finalstr);

	}

	private static String removeAllAdjucentDuplicatesInString(String str) {
		
		Stack<Character> st=new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			if(!st.isEmpty()) {
				char ch=st.peek();
				if(ch==str.charAt(i)) {
					st.pop();
				}
				else {
					st.push(str.charAt(i));
				}
			}
			else
				st.push(str.charAt(i));
		}
		System.out.println(st);
		StringBuilder s1=new StringBuilder();
		for(char c:st) {
			s1.append(c);
		}
		return s1.toString();
	}

}
