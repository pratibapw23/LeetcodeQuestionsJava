package com.leetcodeQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMismatch {

	public static void main(String[] args) {

		int nums[] = {3,2,3,4,6,5};
		int arr[]=findMismatch(nums);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] findMismatch(int[] nums) {
		int arr[]=new int[2];
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			if(set.contains(nums[i])) arr[0]=nums[i];
			set.add(nums[i]);
		}
		for(int i=0;i<nums.length;i++) {
			if(!set.contains(i+1))
				arr[1]=i+1;
		}
		return arr;
	}

}
