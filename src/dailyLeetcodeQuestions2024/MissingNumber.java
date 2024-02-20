package dailyLeetcodeQuestions2024;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int nums[]= {9,6,4,2,3,5,7,0,1};
		int missing=missingNumber(nums);
		System.out.println(missing);

	}

	private static int missingNumber(int[] nums) {
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
		}
		int sn=nums.length*(nums.length+1)/2;
		
		return sn-sum;
	}

}
