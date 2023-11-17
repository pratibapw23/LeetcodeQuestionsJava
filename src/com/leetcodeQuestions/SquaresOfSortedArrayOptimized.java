/*
 Given an integer array nums sorted in non-decreasing order, 
 return an array of the squares of each number sorted in non-decreasing 
 order.
 O(n) 
 */
package com.leetcodeQuestions;

public class SquaresOfSortedArrayOptimized {

	public static void main(String[] args) {
		int nums[]= {-4,-1,0,3,10};
		int suqareArray[]=findSquaresOfArray(nums);
		for(int i=0;i<suqareArray.length;i++)
			System.out.print(suqareArray[i]+" ");
	}

	private static int[] findSquaresOfArray(int[] nums) {
		int left=0;
		int index=nums.length-1;
		int arr[]=new int[nums.length];
		for(int i=nums.length-1;i>0;i--) {
			if(Math.abs(nums[i])>Math.abs(nums[left])) {
				arr[index]=nums[left]*nums[left];
				left++;
			}
			else {
				arr[index]=nums[i]+nums[i];
			}
			index--;
		}
		return arr;
	}
	

}
