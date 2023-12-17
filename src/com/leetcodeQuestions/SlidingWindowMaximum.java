package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		
		int nums[] = {1}, k = 1;
		int arr[]=slidingWindowMax(nums,k);
		System.out.println(Arrays.toString(arr));

	}

	private static int[] slidingWindowMax(int[] nums, int k) {
		int left=0;
//		List<Integer> list1=new ArrayList<>();
		List<Integer> finalList=new ArrayList<>();
		for(int right=k-1;right<nums.length;right++) {
			int temp=left;
			List<Integer> list1=new ArrayList<>();
			while(temp<=right && temp<nums.length) {
				list1.add(nums[temp]);
				temp++;
			}
			finalList.add(Collections.max(list1));
			list1.clear();
			left++;
		}
//		System.out.println(finalList);
		int arr[]=new int[finalList.size()];
		int pos=0;
		for(Integer i:finalList) {
			arr[pos]=i;
			pos++;
		}
			
		return arr;
		
	}

}
