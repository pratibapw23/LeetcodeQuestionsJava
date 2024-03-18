package dailyTargatedLeetcodeQuestions;

public class IsSubsequence {

	public static void main(String[] args) {
		String s="axc",t="ahbgdc";
		boolean res=isSubsequence(s,t);
		System.out.println(res);
	}

	private static boolean isSubsequence(String s, String t) {
		if(s.length()==0)
			return true;
		int i=0,j=0;
		while(i<s.length() && j<t.length()) {
			if(s.charAt(i)==t.charAt(j)) {
				i++;
				j++;
			}
			else j++;
			if(i==s.length())
				return true;
		}
		return false;
	}

}
