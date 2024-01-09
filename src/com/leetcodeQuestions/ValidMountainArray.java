package com.leetcodeQuestions;

public class ValidMountainArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,2,1,0};
		boolean result=checkArrayIdMountainArray(arr);
		System.out.println(result);
	}

	private static boolean checkArrayIdMountainArray(int[] arr) {
		
		if(arr.length<3)
			return false;
		int left=0;
		int right=arr.length-1;
		while(left+1<arr.length-1 && arr[left]<arr[left+1]) left++;
		while(right-1>0 && arr[right]<arr[right-1]) right--;
		
		return left==right;
				
	}

}
