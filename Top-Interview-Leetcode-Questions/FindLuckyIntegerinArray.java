package dailyTargatedLeetcodeQuestions;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyIntegerinArray {

	public static void main(String[] args) {
		int nums[]= {1,2,2,3,3,3};
		int num=findLuckyNumber(nums);
		System.out.println(num);
	}

	private static int findLuckyNumber(int[] nums) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(!map.containsKey(nums[i])) map.put(nums[i], 1);
			else map.put(nums[i], map.get(nums[i])+1);
		}
		System.out.println(map);
		int max=Integer.MIN_VALUE;
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()==entry.getKey()) {
				max=Math.max(max, entry.getKey());
			}
		}
		return max;
	}

}
