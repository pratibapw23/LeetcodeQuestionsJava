package dailyTargatedLeetcodeQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4,2};
		boolean res=containsDuplicates(nums);
		System.out.println(res);
	}

	private static boolean containsDuplicates(int[] nums) {
//		Set<Integer> set=new HashSet<>();
//		for(int i=0;i<nums.length;i++) {
//			if(!set.add(nums[i]))
//				return true;
//			set.add(nums[i]);
//		}
		Arrays.sort(nums);
		int n=nums.length;
		for(int i=1;i<n;i++) {
			if(nums[i]==nums[i-1])
				return true;
		}
		return false;
	}

}
