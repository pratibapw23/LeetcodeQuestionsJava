package dailyTargatedLeetcodeQuestions;

import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		String s="3[a]2[bc]";
		String decoded=decodeString(s);
		System.out.println(decoded);
	}

	private static String decodeString(String s) {
		Stack<Integer> numberStack=new Stack<>();
		Stack<StringBuilder> charStack=new Stack<>();
		int n=0;
		StringBuilder str=new StringBuilder();
		for(char c:s.toCharArray()) {
			if(c>='0' && c<='9') {
				n=(n*10)+(c-'0');
			}
			else if(c=='[') {
				numberStack.push(n);
				n=0;
				charStack.push(str);
				str=new StringBuilder();
			}
			else if(c==']') {
				int count=numberStack.pop();
				StringBuilder t=str;
				str=charStack.pop();
				while(count-->0) {
					str.append(t);
				}
			}
			else {
				str.append(c);
			}
		}
		return str.toString();
	}

}
