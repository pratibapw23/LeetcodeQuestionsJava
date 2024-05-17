package dailyTargated.easy;

import java.util.Arrays;

public class MinimumNumberGame {

	public static void main(String[] args) {
		int nums[]= {5,4,2,3};
		int arr[]=minNumberGame(nums);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] minNumberGame(int[] nums) {
		int arr[]=new int[nums.length];
		Arrays.sort(nums);
		int pos=0;
		for(int i=1;i<nums.length;i+=2) {
			arr[pos]=nums[i];
			arr[pos+1]=nums[i-1];
			pos+=2;
		}
		return arr;
	}

}
