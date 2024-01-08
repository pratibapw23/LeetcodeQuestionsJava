package com.leetcodeQuestions;

import java.util.Arrays;

public class NthTribonacciNumber {

	public static void main(String[] args) {
		
		int n=25;
		int num=tribonacciNumber(n);
		System.out.println(num);

	}

	private static int tribonacciNumber(int n) {
		if(n<=0)
			return 0;
        if(n==1)
            return 1;
        int dp[]=new int[n+1];
		for(int i=0;i<n+1;i++)
			dp[i]=0;
		dp[0]=0;
		dp[1]=1;
		dp[2]=1;
		for(int i=3;i<n+1;i++) {
			dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
		}
//		System.out.println(Arrays.toString(dp));
		return dp[dp.length-1];
	}

}
