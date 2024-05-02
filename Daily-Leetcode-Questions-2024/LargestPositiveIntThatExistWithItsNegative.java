package dailyLeetcodeQuestions2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestPositiveIntThatExistWithItsNegative {

	public static void main(String[] args) {
		int nums[]= {-1,2,-3,3};
		int largetInt=largestPositiveIntegerThatExistWithItsNegative(nums);
		System.out.println(largetInt);
	}

	private static int largestPositiveIntegerThatExistWithItsNegative(int[] nums) {
		Arrays.sort(nums);
		List<Integer> list=new ArrayList<>();
		for(int num:nums)
			list.add(num);
		for(int i=nums.length-1;i>0;i--) {
			int curr=nums[i];
			if(list.contains(-curr))
				return curr;
		}
		return -1;
	}

}
