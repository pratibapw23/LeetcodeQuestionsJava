package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		
		int nums[]= {-1,0,1,2,-1,-4};
		List<ArrayList<Integer>> list=threesum(nums);
		System.out.println(list);
	}

	private static List<ArrayList<Integer>> threesum(int[] nums) {
		List<ArrayList<Integer>> mainlist=new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				for(int k=j+1;k<nums.length;k++) {
					if((nums[i]+nums[j]+nums[k])==0) {
						ArrayList<Integer> list=new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
						mainlist.add(new ArrayList<>(list));
					}
				}
			}
		}
		System.out.println(mainlist);
		return null;
	} 
}
