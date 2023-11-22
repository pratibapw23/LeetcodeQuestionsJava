/*
Given an array of integers nums, calculate the pivot index of this array.
The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
Return the leftmost pivot index. If no such index exists, return -1.
 */
package com.leetcodeQuestions;

public class FindPivotIndex {

	public static void main(String[] args) {

		int nums[]= {2,1,-1};
		int pivotIndex=findPivotIndex(nums);
		System.out.println(pivotIndex);
	}

	private static int findPivotIndex(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			int tempIndex=i;
			int lsum=0;
			int rsum=0;
			for(int left=0;left<tempIndex;left++) {
				lsum+=nums[left];
			}
			for(int right=tempIndex+1;right<nums.length;right++) {
				rsum+=nums[right];
			}
			if(rsum==lsum)
				return tempIndex;
			System.out.print("\t sum for "+" "+i+"="+lsum);
			System.out.println("\t right sum for "+" "+i+"="+rsum);
		}
		
		return -1;
	}

}
