/*
 Given an array of integers nums and an integer target, 
 return indices of the two numbers such that they add up to target 
*/

package com.leetcodeQuestions;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		
		int nums[]={2,7,11,15};
		int target=9;
		int indices[]=twoSum(nums,target);
		System.out.println(indices[0]+"\n"+indices[1]);

	}

	private static int[] twoSum(int[] nums, int target) {
//		int indices[]=new int[2];
		int left=0;
		Arrays.sort(nums);
		int right=nums.length-1;
		while(nums[left]+nums[right]!=target) {
			if(nums[left]+nums[right]<target)
				left++;
			else
				right--;
		}
//		for(int i=0;i<nums.length;i++) {
//			int sum=0;
//			for(int j=i+1;j<nums.length;j++) {
//				sum=nums[i]+nums[j];
//				if(sum==target) {
//					indices[0]=i+1;
//					indices[1]=j+1;
//				}
//			}
//		}
		return new int[] {left+1,right+1};
	}

}
