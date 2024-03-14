package dailyLeetcodeQuestions2024;

import java.util.HashMap;
import java.util.Map;

public class BinarySubarraysWithSum {

	public static void main(String[] args) {
		int nums[]= {0,0,0,0,0};
		int goal=0;
		int subarrays=binarySubarrayWithSum(nums,goal);
		System.out.println(subarrays);
	}

	private static int binarySubarrayWithSum(int[] nums, int goal) {
		int count=0;
		int sum=0;
		Map<Integer,Integer> map=new HashMap<>();
		map.put(0, 1);
		for(int i:nums) {
			sum+=i;
			if(map.containsKey(sum-goal)) count+=map.get(sum-goal);
			map.put(sum, map.getOrDefault(sum, 0)+1);
		}
		return count;
	}

}
