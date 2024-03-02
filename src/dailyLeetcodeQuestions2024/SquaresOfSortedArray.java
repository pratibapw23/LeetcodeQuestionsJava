package dailyLeetcodeQuestions2024;

import java.util.Arrays;

public class SquaresOfSortedArray {

	public static void main(String[] args) {
		int nums[]= {-4,-1,0,3,10};
		int arr[]=squaresOfSortedArray(nums);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] squaresOfSortedArray(int[] nums) {
		int arr[]=new int[nums.length];
		
		for(int i=0;i<nums.length;i++) {
			arr[i]=nums[i]*nums[i];
		}
		Arrays.sort(arr);
		return arr;
	}

}
