package dailyLeetcodeQuestions;

public class LargetSubstring31Dec {

	public static void main(String[] args) {
		String s="jdhfa";
		int len=largestSubstringBetweenTwoEqualCharacters(s);
		System.out.println(len);
	}

	private static int largestSubstringBetweenTwoEqualCharacters(String s) {
		int count=-1;
		int maxlen=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count=j-i-1;
				}
				maxlen=Math.max(maxlen, count);
			}
		}
		return maxlen;
	}

}
