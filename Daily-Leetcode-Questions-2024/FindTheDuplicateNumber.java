package dailyLeetcodeQuestions2024;

import java.util.Arrays;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		int nums[]= {3,1,3,4,2};
		int dup=findDuplicateNumber(nums);
		System.out.println(dup);
	}

	private static int findDuplicateNumber(int[] nums) {
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==nums[i+1])
				return nums[i];
		}
		return 0;
	}

}
