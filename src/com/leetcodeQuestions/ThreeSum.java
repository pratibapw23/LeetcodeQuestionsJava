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
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				for(int k=j+1;k<nums.length;k++) {
					if((nums[i]+nums[j]+nums[k])==0) {
						ArrayList<Integer> list=new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
						set.addAll(Arrays.asList(list));
					}
				}
			}
		}
		return new ArrayList<>(set);
	} 
}
