/*
 * Given two integer arrays nums1 and nums2, return an array of their
 *  intersection. Each element in the result must be unique and you may 
 *  return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
 */
package com.leetcodeQuestions;

import java.util.HashSet;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		
		int nums1[]= {4,9,5};
		int nums2[]= {9,4,9,8,4};
		
		int intersection[]=findIntersectiononTwoArrays(nums1,nums2);
		for(int i=0;i<intersection.length;i++)
			System.out.print(intersection[i]+" ");
	}

	private static int[] findIntersectiononTwoArrays(int[] nums1, int[] nums2) {
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<nums1.length;i++) {
			for(int j=0;j<nums2.length;j++) {
				if(nums1[i]==nums2[j]) {
					set.add(nums1[i]);
				}
			}
		}
//		System.out.println(set);
		int intersection[]=set.stream().mapToInt(Integer::intValue).toArray();
		
		return intersection;
	}

}
