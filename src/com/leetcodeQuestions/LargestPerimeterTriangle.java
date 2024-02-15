package com.leetcodeQuestions;

import java.util.Arrays;

public class LargestPerimeterTriangle {

	public static void main(String[] args) {
		int nums[]= {3,2,3,4};
		int perimeter=largestPerimeterTriable(nums);
		System.out.println(perimeter);
	}

	private static int largestPerimeterTriable(int[] nums) {
		int n=nums.length;
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int sum=0;
		for(int i=n-1;i>=2;i--) {
			if((nums[i]<(nums[i-1]+nums[i-2]))) {
				return nums[i]+nums[i-1]+nums[i-2];
			}
		}
		return 0;
	}

}
