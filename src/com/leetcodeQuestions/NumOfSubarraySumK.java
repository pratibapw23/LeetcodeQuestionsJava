package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class NumOfSubarraySumK {

	public static void main(String[] args) {
		int arr[]= {1,2,3};
		int k=3;
		
		int count=subarraySum(arr,k);
		System.out.println(count);
	}

	private static int subarraySum(int[] arr, int k) {
		
		List<ArrayList<Integer>> res=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i;j<arr.length;j++) {
				List<Integer>  list=new ArrayList<>();
				for(int k1=i;k1<=j;k1++) {
					list.add(arr[k1]);
				}
				res.add(new ArrayList<>(list));
			}
			
		}
		int count=0;
		for(ArrayList<Integer> l:res) {
			int sum=0;
			for(int i=0;i<l.size();i++) {
				sum+=l.get(i);
			}
			if(sum==k)
				count++;
		}
		return count;
	}

}
