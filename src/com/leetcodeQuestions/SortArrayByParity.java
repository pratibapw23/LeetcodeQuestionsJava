package com.leetcodeQuestions;

import java.util.Arrays;

public class SortArrayByParity {

	public static void main(String[] args) {
		int nums[]= {3,1,2,4};
		int sortedArray[]=sortArray(nums);
		System.out.println(Arrays.toString(sortedArray));
	}

	private static int[] sortArray(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2!=0) { //odd no
				for(int j=i+1;j<nums.length;j++) {
					if(nums[j]%2==0) { //even no
						int temp=nums[j];
						nums[j]=nums[i];
						nums[i]=temp;
					}
				}
			}
			
		}
		return nums;
	}

}
