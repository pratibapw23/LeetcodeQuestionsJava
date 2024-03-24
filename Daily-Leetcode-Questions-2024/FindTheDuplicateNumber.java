package dailyLeetcodeQuestions2024;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		int nums[]= {3,1,3,4,2};
		int dup=findDuplicateNumber(nums);
		System.out.println(dup);
	}

	private static int findDuplicateNumber(int[] nums) {
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			if(!set.add(nums[i]))
				return nums[i];
			set.add(nums[i]);
		}
		return 0;
	}

}
