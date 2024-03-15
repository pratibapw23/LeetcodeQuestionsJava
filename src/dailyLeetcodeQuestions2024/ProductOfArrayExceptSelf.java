package dailyLeetcodeQuestions2024;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4};
		int arr[]=productOfArrayExceptSelf(nums);
		System.out.println(Arrays.toString(arr));
		
	}

	private static int[] productOfArrayExceptSelf(int[] nums) {
		int allProduct=1;
		int arr[]=new int[nums.length];
		int pos=0;
		for(int num:nums) {
			arr[pos++]=allProduct;
			allProduct*=num;
		}
		allProduct=1;
		for(int i=nums.length-1;i>=0;i--) {
			arr[i]*=allProduct;
			allProduct*=nums[i];
		}
		return arr;
	}

}
