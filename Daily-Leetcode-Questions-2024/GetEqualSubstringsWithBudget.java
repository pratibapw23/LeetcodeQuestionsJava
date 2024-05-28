package dailyLeetcodeQuestions2024;

public class GetEqualSubstringsWithBudget {

	public static void main(String[] args) {
		String s = "abcd", t = "bcdf";
		int maxCost = 3;
		int cost=getEqualSubstringsWithBudget(s,t,maxCost);
		System.out.println(cost);

	}

	private static int getEqualSubstringsWithBudget(String s, String t, int maxCost) {
		int left=0;
		int maxLen=Integer.MIN_VALUE;
		int cost=0;
		for(int right=0;right<s.length();right++) {
			cost+=Math.abs(s.charAt(right)-t.charAt(right));
			while(cost>maxCost) {
				cost-=Math.abs(s.charAt(left)-t.charAt(left));
				left++;
			}
			maxLen=Math.max(maxLen, right-left+1);
		}
		return maxLen;
	}

}
