/*
 Given an integer array nums sorted in non-decreasing order, 
 return an array of the squares of each number sorted in non-decreasing 
 order.
 O(nlogn) 
 */
package com.leetcodeQuestions;

import java.util.Arrays;
import java.util.Collections;

public class SquaresOfSortedArray {

	public static void main(String[] args) {
		
		int nums[]= {-4,-1,0,3,10};
		int suqareArray[]=findSquaresOfArray(nums);
		for(int i=0;i<suqareArray.length;i++)
			System.out.print(suqareArray[i]+" ");
	}

	private static int[] findSquaresOfArray(int[] nums) {
		
		int arr[]=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			arr[i]=nums[i]*nums[i];
		}
		Arrays.sort(arr);
		
		return arr;
	}

}
