/*
 * Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five 
elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k 
(hence they are underscores).
 */
package com.leetcodeQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArrayII {

	public static void main(String[] args) {
		int nums[]= {0,0,1,1,1,2,2,3,3,4};
		int k=removeDuplicates(nums);
		System.out.println(k);
	}

	private static int removeDuplicates(int[] nums) {
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(!map.containsKey(nums[i]))
			{
				map.put(nums[i], 1);
			}
			else {
				map.put(nums[i], map.get(nums[i])+1);
			}
		}
		int i=0;
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if((entry.getValue()>2)) {
				
			}
			i++;
		}
//		System.out.println(map);
		for(int j=0;j<nums.length;j++) {
			System.out.print(nums[j]+" ");
		}
		return 0;
	}

}
