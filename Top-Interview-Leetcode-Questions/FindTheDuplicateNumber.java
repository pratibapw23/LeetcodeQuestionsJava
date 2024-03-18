package dailyTargatedLeetcodeQuestions;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		int nums[]= {3,1,3,4,2};
		int duplicate=findTheDuplicateNumber(nums);
		System.out.println(duplicate);
	}

	private static int findTheDuplicateNumber(int[] nums) {
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			if(!set.add(nums[i]))
				return nums[i];
			set.add(nums[i]);
		}
		return 0;
	}

}
