package dailyLeetcodeQuestions2024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortColors {

	public static void main(String[] args) {
		int[] nums = {2,0,1};
		sortColors(nums);
		
	}

	private static void sortColors(int[] nums) {
		Map<Integer,Integer> map=new HashMap<>();
		map.put(0, 0);
		map.put(1, 0);
		map.put(2, 0);
		for(int i:nums)
			map.put(i, map.getOrDefault(i, 0)+1);
		int pos=0;
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			for(int i=0;i<entry.getValue();i++) {
				nums[pos++]=entry.getKey();
			}
		}
		System.out.println(Arrays.toString(nums));
		
	}

}
