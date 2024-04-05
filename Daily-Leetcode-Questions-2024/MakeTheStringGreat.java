package dailyLeetcodeQuestions2024;

import java.util.Stack;

public class MakeTheStringGreat {

	public static void main(String[] args) {
		String s = "leEeetcode";
		String str=makeStringGreat(s);
		System.out.println(str);
	}

	private static String makeStringGreat(String s) {
		StringBuffer str=new StringBuffer();
		Stack<Character> st=new Stack<>();
		st.push(s.charAt(0));
		for(int i=1;i<s.length();i++) {
				if(!st.isEmpty() && (st.peek()-s.charAt(i)==32 || st.peek()-s.charAt(i)==-32)) {
						st.pop();
				}
				else
					st.push(s.charAt(i));
		}
		while(!st.isEmpty()) {
			str.append(st.peek());
			st.pop();
		}
		str.reverse();
		System.out.println(st);
		return str.toString();
	}

}
