/*
 Given an array of integers nums and an integer target, 
 return indices of the two numbers such that they add up to target 
*/
package com.leetcodeQuestions;

import java.util.HashMap;

public class TwoSumOptimized {

	public static void main(String[] args) {
		int nums[]={3,2,3};
		int target=6;
		int indices[]=twoSum(nums,target);
		System.out.println(indices[0]+"\n"+indices[1]);
	}

	private static int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++)
			map.put(nums[i], i);
		for(int i=0;i<nums.length;i++) {
			int comp=target-nums[i];
			if(map.containsKey(comp) && map.get(comp)!=i) {
				return new int[] {i,map.get(comp)};
			}
		}
		return new int[] {};
	}

}
