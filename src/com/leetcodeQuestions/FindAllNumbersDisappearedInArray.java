//4,3,2,7,8,2,3,1
package com.leetcodeQuestions;

import java.util.ArrayList;

public class FindAllNumbersDisappearedInArray {

	public static void main(String[] args) {
		
		int nums[]= {2,2};
		ArrayList<Integer> list=findAllDisappearedNumbersInArray(nums);
	}

	private static ArrayList<Integer> findAllDisappearedNumbersInArray(int[] nums) {
		
		ArrayList<Integer> list=new ArrayList<>();
		
		if(nums.length==2 && nums[0]==nums[1])
			list.add(nums[0]+1);
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		System.out.println(max);
		for(int j=1;j<=max;j++) {
				list.add(j);
		}
//		for(int i=0;i<list.size();i++) {
//			for(int j=0;j<nums.length;j++) {
//				if(nums[j]==list.get(i)) {
//					list.remove(i);
//				}
//			}
//		}
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<list.size();j++) {
				if(nums[i]==list.get(j)) {
					list.remove(j);
				}
			}
		}
		
		System.out.println(list);
		return list;
	}

}
