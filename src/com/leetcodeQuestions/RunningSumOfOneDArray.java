package com.leetcodeQuestions;

import java.util.Arrays;

public class RunningSumOfOneDArray {

	public static void main(String[] args) {
		
		int nums[]= {1,2,3,4};
		int sum[]=findRunningSum(nums);
		System.out.println(Arrays.toString(sum));

	}

	private static int[] findRunningSum(int[] nums) {
		
		int runningSum[]=new int[nums.length];
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
			runningSum[i]=sum;
		}
		return runningSum;
	}

}
