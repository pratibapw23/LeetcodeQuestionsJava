package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII {

	public static void main(String[] args) {
		int nums1[]= {4,9,5};
		int nums2[]= {9,4,9,8,4};
		
		int intersection[]=findIntersectiononTwoArrays(nums1,nums2);
		for(int i=0;i<intersection.length;i++)
			System.out.print(intersection[i]+" ");
	}
	private static int[] findIntersectiononTwoArrays(int[] nums1, int[] nums2) {
		Map<Integer,Integer> map1=new HashMap<>();
		Map<Integer,Integer> map2=new HashMap<>();
		List<Integer> list=new ArrayList<>();
		
		for(int i=0;i<nums1.length;i++)
			if(!map1.containsKey(nums1[i])) map1.put(nums1[i], 1);
			else map1.put(nums1[i], map1.get((nums1[i]))+1);
		
		for(int i=0;i<nums2.length;i++)
			if(!map2.containsKey(nums2[i])) map2.put(nums2[i], 1);
			else map2.put(nums2[i], map2.get((nums2[i]))+1);
		
		for(Integer num:map1.keySet()) {
			if(map2.containsKey(num)) {
				int min=Math.min(map1.get(num), map2.get(num));
				while(min-- > 0) {
					list.add(num);
				}
			}
		}
		int arr[]=new int[list.size()];
		for(int i=0;i<list.size();i++) {
			arr[i]=list.get(i);
		}
		return arr;

}
}
