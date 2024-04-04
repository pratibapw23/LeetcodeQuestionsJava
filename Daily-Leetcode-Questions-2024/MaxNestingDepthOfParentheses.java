package dailyLeetcodeQuestions2024;

public class MaxNestingDepthOfParentheses {

	public static void main(String[] args) {
		String s = "(1)+((2))+(((3)))";
		int depth=maxNestingDepth(s);
		System.out.println(depth);
	}

	private static int maxNestingDepth(String s) {
		int maxcounter=Integer.MIN_VALUE;
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(')
				count++;
			else if(s.charAt(i)==')')
				count--;
			maxcounter=Math.max(maxcounter, count);
		}
		return maxcounter;
	}

}
