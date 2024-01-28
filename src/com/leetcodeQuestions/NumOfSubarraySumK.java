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
		int count=0;
		List<ArrayList<Integer>> res=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				
				sum+=arr[j];
				if(sum==k)
					count++;
			}
			
		}
		return count;
	}

}
