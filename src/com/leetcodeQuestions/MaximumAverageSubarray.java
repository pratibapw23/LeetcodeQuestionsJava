package com.leetcodeQuestions;

public class MaximumAverageSubarray {

	public static void main(String[] args) {
		int nums[]= {-1};
		int k=1;
		double maxAvg=maximumAverageSubarray(nums,k);
		System.out.println(maxAvg);
	}

	private static double maximumAverageSubarray(int[] nums, int k) {
		int left=0;
		int max=Integer.MIN_VALUE;
		for(int right=k-1;right<nums.length;right++) {
			int avg=0;
			int t=left;
			while(t<=right) {
				avg+=nums[t];
				t++;
			}
			if(avg>max)
				max=avg;
			left++;
		}
		return (double)max/k;
	}

}
