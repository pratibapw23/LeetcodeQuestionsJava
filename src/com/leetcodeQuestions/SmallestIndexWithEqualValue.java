package com.leetcodeQuestions;

public class SmallestIndexWithEqualValue {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,6,7,8,9,0};
		int index=findSmallestIndex(nums);
		System.out.println(index);
	}

	private static int findSmallestIndex(int[] nums) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++) {
			int index = 0;
			if(i%10==nums[i]) {
				index=i;
				if(index<min)
					min=index;
			}
			
		}
		if(min==Integer.MAX_VALUE)
			return -1;
		return min;
	}

}
