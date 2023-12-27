package com.leetcodeQuestions;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int height[]= {1,1};
		int mostwater=findContainerWithMostWater(height);
		System.out.println(mostwater);
	}

	private static int findContainerWithMostWater(int[] height) {
		int max=Integer.MIN_VALUE;
		int left=0,right=height.length-1;
		
		while(left<right) {
			int min=0;
			int dist=0;
			if(height[left]<height[right]) {
				min=height[left];
				dist=right-left;
				max=Math.max(max, min*dist);
				left++;
			}
			else {
				min=height[right];
				dist=right-left;
				max=Math.max(max, min*dist);
				right--;
			}
		}
		return max;
	}

}
