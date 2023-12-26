package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		
		int nums[]= {-1,0,1,2,-1,-4};
		List<List<Integer>> list=threesum(nums);
		System.out.println(list);
	}

	private static List<List<Integer>> threesum(int[] nums) {
		Arrays.sort(nums);
		Set<List<Integer>> set=new HashSet<>();
		for(int i=0;i<nums.length-2;i++) {
			int j=i+1;
			int k=nums.length-1;
			while(j<k) {
				int sum=nums[j]+nums[k];
				if(sum==(-nums[i])) {
					set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
				}
				else if(sum<-nums[i]) j++;
				else if(sum>-nums[i]) k--;
			}
		}
		return new ArrayList<>(set);

	} 
}
