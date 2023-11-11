/*Given an integer array nums, move all 0's to the end of it
while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.*/

package com.leetcodeQuestions;

public class MoveZero {

	public static void main(String[] args) {
		
		int nums[]= {0,4,3,2,2,2,9,0,0,0,0,1,2};
		moveZeros(nums);
	}

	private static void moveZeros(int[] nums) {
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==0 && nums[j]!=0) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}

}
