package dailyLeetcodeQuestions2024;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubarrayWithAtMostKFreq {

	public static void main(String[] args) {
		int nums[]= {1,2,3,1,2,3,1,2};
		int k=2;
		int len=maxSubarrayLength(nums,k);
		System.out.println(len);
	}

	private static int maxSubarrayLength(int[] nums, int k) {
		int left=0;
		int count=0;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
			while(map.get(nums[i])>k) {
				map.put(nums[i], map.get(nums[i])-1);
				left++;
			}
			count=Math.max(count, i-left+1);
		}
		return count;
	}

}
