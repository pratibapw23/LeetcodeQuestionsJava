package dailyLeetcodeQuestions2024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumberIII {

	public static void main(String[] args) {
		int[] nums = {1,2,1,3,2,5};
		int arr[]=singleNumber(nums);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] singleNumber(int[] nums) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int num:nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		int arr[]=new int[2];
		int pos=0;
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				arr[pos++]=entry.getKey();
			}
			if(pos==2) break;
		}
		System.out.println(map);
		return arr;
	}

}
