package com.leetcodeQuestions;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		int nums[]= {3,2,1};
		int max=findThirdMaximumNumber(nums);
		System.out.println(max);
	}

	private static int findThirdMaximumNumber(int[] nums) {
		HashSet<Integer> set=new HashSet<>();
		LinkedList<Integer> list=new LinkedList<>();
		for(int i=0;i<nums.length;i++) {
			set.add(nums[i]);
		}
		Iterator<Integer> it=set.iterator();
		while(it.hasNext())
			list.add(it.next());
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		if(list.size()==2)
			return list.get(0);
			
		if(list.size()==1)
			return list.get(0);
		if(!list.isEmpty()) {
			return list.get(2);
		}
		else
		return 0;
	}

}
