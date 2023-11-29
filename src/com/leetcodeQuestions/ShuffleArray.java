package com.leetcodeQuestions;

import java.util.Arrays;

public class ShuffleArray {

	public static void main(String[] args) {
		
		int nums[] = {2,5,1,3,4,7};
		int n = 3;
		int shuffeledArray[]=shuffleTheArray(nums,n);
		System.out.println(Arrays.toString(shuffeledArray));

	}

	private static int[] shuffleTheArray(int[] nums, int n) {
		int arr[]=new int[nums.length];
		int i=0;
		int j=n;
		int m=0;
		while(i!=n && j!=nums.length) {
			arr[m]=nums[i];
			arr[m+1]=nums[j];
			i++;
			j++;
			m+=2;
		}
		return arr;
	}

}
