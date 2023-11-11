/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
*/

package com.leetcodeQuestions;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		
		int nums[]= {1,1,1,1,1,1,8};
		int majorityElement=findMajorityElement(nums);
		System.out.println(majorityElement);

	}

	private static int findMajorityElement(int[] nums) {
		int count=nums.length/2;
		System.out.println(count);
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			}
			else {
				map.put(nums[i], map.get(nums[i])+1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()>count) {
				return entry.getKey();
			}
		}
		System.out.println(map);
		return 0;
	}

}
