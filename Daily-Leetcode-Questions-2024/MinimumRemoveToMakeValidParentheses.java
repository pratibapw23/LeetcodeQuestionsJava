package dailyLeetcodeQuestions2024;

import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {

	public static void main(String[] args) {
		String s = "lee(t(c)o)de)";
		String str=remove(s);
		System.out.println(str);
	}

	private static String remove(String s) {
		StringBuilder str=new StringBuilder();
		Stack<Character> st=new Stack<>();
		int n=s.length();
		int leftcount=0,rightcount=0;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='(') {
				leftcount++;
			}
			if(s.charAt(i)==')') {
					rightcount++;
			}
			if(rightcount>leftcount) {
				rightcount--;
				continue;
			}
			else
				st.push(s.charAt(i));
		}
		while(!st.isEmpty()) {
			char ch=st.pop();
			if(leftcount>rightcount && ch=='(') {
				leftcount--;
				continue;
			}
			else
				str.append(ch);
		}
		System.out.println(str);
		return str.reverse().toString();
	}

}
