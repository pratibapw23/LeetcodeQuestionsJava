package dailyLeetcodeQuestions2024;

public class ValidParenthesesString {

	public static int[][] t=new int[101][101];
	public static void main(String[] args) {
		String s = "(*))";
		boolean res=validParenthesesString(s);
		System.out.println(res);
	}

	private static boolean validParenthesesString(String s) {
		int i=0;
		int opencount=0;
		for(int k=0;k<t.length;k++) {
			for(int p=0;p<t[i].length;p++) {
				t[k][p]=-1;
			}
		}
		return solve(i,opencount,s);
	}

	private static boolean solve(int i, int opencount, String s) {
		if(i==s.length())
			return opencount==0;
		if(t[i][opencount]!=-1)
			return t[i][opencount]==0?false:true;
		char str[]=s.toCharArray();
		boolean isValid=false;
		if(str[i]=='(') {
			isValid=solve(i+1,opencount+1,s);
		}
		else if(str[i]=='*') {
			isValid|=solve(i+1,opencount,s);
			isValid|=solve(i+1,opencount+1,s);
			if(opencount>0)
				isValid|=solve(i+1, opencount-1,s);
		}
		else {
			if(opencount>0) {
				isValid|=solve(i+1, opencount-1,s);
			}
		}
		return isValid;
	}

}
