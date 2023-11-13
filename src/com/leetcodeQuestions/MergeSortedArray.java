
/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing 
order, and two integers m and n, representing the number of elements in 
nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, 
but instead be stored inside the array nums1. To accommodate this, 
nums1 has a length of m + n, where the first m elements denote the 
elements that should be merged, and the last n elements are set to
 0 and should be ignored. nums2 has a length of n.
 */
package com.leetcodeQuestions;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		
		int nums1[]= {0,0,0,0,0};
		int nums2[]= {1,2,3,4,5};
		int m=0;
		int n=5;
		
		merge(nums1, m, nums2, n);

	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		if(nums1.length==1 && nums1[0]==0)
			nums1[0]=nums2[0];
	    int j=0;
		for(int i=m;i<nums1.length;i++,j++) {
			nums1[i]=nums2[j];
		}
		
		Arrays.sort(nums1);
		for(int k=0;k<nums1.length;k++)
			System.out.println(nums1[k]);
	}

}
