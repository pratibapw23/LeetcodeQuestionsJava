package com.leetcodeQuestions;

import java.util.HashSet;

public class SingleNumber {

	public static void main(String[] args) {
		int nums[]= {4,1,2,1,2};
		int n=findSingleNumber(nums);
		System.out.println(n);
	}

	private static int findSingleNumber(int[] nums) {
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			if(!set.add(nums[i])) {
				set.remove(nums[i]);
			}
		}
		return set.iterator().next();
	}

}
