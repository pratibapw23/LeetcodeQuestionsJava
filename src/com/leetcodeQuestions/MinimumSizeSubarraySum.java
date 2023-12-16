package com.leetcodeQuestions;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		int arr[]= {2,3,1,2,4,3};
		int target=7;
		int len=findMinimumSizeSubarray(arr,target);
		System.out.println(len);
	}

	private static int findMinimumSizeSubarray(int[] arr, int target) {
		int left=0;
		int minlen=Integer.MAX_VALUE;
		int sum=0;
		
		for(int right=0;right<arr.length;right++) {
			sum+=arr[right];
			while(sum>=target) {
				minlen=Math.min(minlen, right-left+1);
				sum-=arr[left];
				left++;
			}
			
		}
		
		
//		for(right=0;right<arr.length;right++) {
//			if(sum>=target) {
//				minlen=Math.min(minlen, right-left+1);
//				sum-=arr[left];
//			}
//			else
//				sum+=arr[right];
//		while(sum>=target) {
//			minlen=Math.min(minlen, right-left+1);
//			sum-=arr[left];
//			left++;
//		}
//		}
		if(minlen==Integer.MAX_VALUE)
			return 0;
//		System.out.println("Minlength="+minlen);
//		System.out.println("Minleft="+minleft);
		
		return minlen;
	}

}
