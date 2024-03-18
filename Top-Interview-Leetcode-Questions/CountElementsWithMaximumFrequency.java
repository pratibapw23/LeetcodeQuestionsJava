package dailyTargatedLeetcodeQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountElementsWithMaximumFrequency {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5};
		int count=countElementsWithMaxFrequency(nums);
		System.out.println(count);
	}

	private static int countElementsWithMaxFrequency(int[] nums) {
		List<Integer> freqs=new ArrayList<>();
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(!map.containsKey(nums[i])) map.put(nums[i], 1);
			else map.put(nums[i], map.get(nums[i])+1);
		}
		for(Integer i:map.values()) {
			freqs.add(i);
		}
		int max=Collections.max(freqs);
		System.out.println(map);
		int sum=0;
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()==max) {
				sum+=entry.getValue();
			}
		}
		return sum;
	}

}
