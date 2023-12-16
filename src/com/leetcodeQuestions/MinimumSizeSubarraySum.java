package com.leetcodeQuestions;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		int arr[]= {1,4,4};
		int target=4;
		int len=findMinimumSizeSubarray(arr,target);
		System.out.println(len);
	}

	private static int findMinimumSizeSubarray(int[] arr, int target) {
		int left=0;
		int minleft=0;
		int minlen=0;
		int sum=0;
		int right=0;
		for(right=0;right<arr.length;right++) {
			if(sum>=target) {
				minlen=Math.min(minlen, right-left+1);
				sum-=arr[left];
			}
			else
				sum+=arr[right];
		while(sum>=target) {
			minlen=Math.min(minlen, right-left+1);
			sum-=arr[left];
			left++;
		}
		}
		System.out.println("Minlength="+minlen);
		System.out.println("Minleft="+minleft);
		return minlen;
	}

}
