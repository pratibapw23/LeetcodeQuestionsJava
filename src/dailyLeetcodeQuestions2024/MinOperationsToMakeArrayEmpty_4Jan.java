package dailyLeetcodeQuestions2024;

import java.util.HashMap;
import java.util.Map;

public class MinOperationsToMakeArrayEmpty_4Jan {
	public static void main(String args[]) {
		
		int nums[]= {2,1,2,2,3,3};
		int operations=minOperations(nums);
		System.out.println(operations);
	}

	private static int minOperations(int[] nums) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			}
			else {
				int val=map.get(nums[i]);
				map.put(nums[i], val+1);
			}
		}
		int count=0;
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1)
				return -1;
			if(entry.getValue()%3==0) {
				count+=((entry.getValue())/3);
			}
			if(entry.getValue()%3==1) {
				count+=(1+(entry.getValue()/3));
			}
			if(entry.getValue()%3>=2) {
				int rem=entry.getValue()%3;
				count+=((entry.getValue()/3)+(rem-1));
			}
		}
//		System.out.println(map);
		return count;
	}
}
