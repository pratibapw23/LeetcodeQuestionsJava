package dailyLeetcodeQuestions2024;

import java.util.Stack;

public class RemoveKDigits {

	public static void main(String[] args) {
		String num = "1432219";
		int k = 3;
		String smallerDigit=removeKDigit(num,k);
		System.out.println(smallerDigit);
	}

	private static String removeKDigit(String num, int k) {
		if(k==num.length())
			return "0";
		Stack<Character> st=new Stack<>();
		char ch[]=num.toCharArray();
		for(int i=0;i<num.length();i++) {
			while(!st.isEmpty() && st.peek()>num.charAt(i) && k>0) {
				st.pop();
				k--;
			}
			st.push(num.charAt(i));
		}
		while(!st.isEmpty() && k>0) {
			st.pop();
			k--;
		}
		StringBuilder str=new StringBuilder();
		while(!st.isEmpty()) {
			str.append(st.pop());
		}
		str.reverse();
		while(str.length()>0 && str.charAt(0)=='0') {
			str.deleteCharAt(0);
		}
		return str.length()>0?str.toString():"0";
	}

}
