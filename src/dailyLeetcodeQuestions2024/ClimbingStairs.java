package dailyLeetcodeQuestions2024;

import java.util.Arrays;

public class ClimbingStairs {

	public static void main(String[] args) {
		int n=5;
		int count=climbingStairs(n);
		System.out.println(count);
	}

	private static int climbingStairs(int n) {
		if(n==1)
			return n;
		int dp[]=new int[n];
		dp[0]=1;
		dp[1]=2;
		for(int i=2;i<n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<dp.length;i++) {
			if(dp[i]>max)
				max=dp[i];
		}
		return max;
	}

}
