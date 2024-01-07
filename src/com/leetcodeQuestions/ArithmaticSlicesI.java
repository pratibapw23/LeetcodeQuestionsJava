package com.leetcodeQuestions;

import java.util.Arrays;

public class ArithmaticSlicesI {

	public static void main(String[] args) {
		
		int nums[]= {1,2,3,8,9,10};
		int slices=arithmaticSlices(nums);
		System.out.println(slices);

	}

	private static int arithmaticSlices(int[] nums) {
		int n=nums.length;
		if(n<=2)
			return 0;
		int sum=0;
		int arr[]=new int[n];
		for(int i=2;i<n;i++) {
			if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]) {
				arr[i]=arr[i-1]+1;
				sum+=arr[i];
			}
		}
//		System.out.println(Arrays.toString(arr));
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			sum+=arr[i];
//		}
		return sum;
	}

}
