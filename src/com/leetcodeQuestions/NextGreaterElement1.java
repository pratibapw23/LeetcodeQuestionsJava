package com.leetcodeQuestions;

import java.util.Arrays;

public class NextGreaterElement1 {

	public static void main(String[] args) {
		
		int nums1[] = {2,4};
		int nums2[] = {1,2,3,4};
		int arr[]=nextGreaterElement(nums1,nums2);
		System.out.println(Arrays.toString(arr));

	}

	private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int arr[]=new int[nums1.length];
		for(int i=0;i<nums1.length;i++) {
			for(int j=0;j<nums2.length;j++) {
				if(nums1[i]==nums2[j]) {
					if(j==nums2.length-1)
						arr[i]=-1;
					else {
						for(int k=j;k<nums2.length;k++) {
							if(nums2[k]>nums2[j]) {
								arr[i]=nums2[k];
								break;
							}
								
							else
								arr[i]=-1;
					}
					}
				}
			}
		}
		return arr;
	}

}
