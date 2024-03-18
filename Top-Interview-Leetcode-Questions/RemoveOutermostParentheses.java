package dailyTargatedLeetcodeQuestions;

public class RemoveOutermostParentheses {

	public static void main(String[] args) {
		String s = "(()())(())";
		String res=removeOuterParentheses(s);
		System.out.println(res);
	}

	private static String removeOuterParentheses(String s) {
		int opencount=1;
		StringBuilder res=new StringBuilder();
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)=='(') {
					opencount++;
					if(opencount>1) 
						res.append('(');
			}
			else {
					if(opencount>1) 
						res.append(')');
				opencount--;
			}
		}
		return res.toString();
	}

}
