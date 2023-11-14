/*
Given an integer array nums sorted in non-decreasing order, 
remove the duplicates in-place such that each unique element appears only 
once. The relative order of the elements should be kept the same. 
Then return the number of unique elements in nums.
Consider the number of unique elements of nums to be k, to get accepted, 
you need to do the following things:
Change the array nums such that the first k elements of nums contain the 
unique elements in the order they were present in nums initially. 
The remaining elements of nums are not important as well as the size of 
nums.Return k.
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 */
package com.leetcodeQuestions;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {

		int nums[]= {0,0,1,1,1,2,2,3,3,4};
		int k=removeDuplicates(nums);
		System.out.println(k);
	}

	private static int removeDuplicates(int[] nums) {
		
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<nums.length;i++) {
			set.add(nums[i]);
		}
		int k=0;
		for(Integer i:set) {
			nums[k]=i;
			k++;
		}
		return k;
	}

}
