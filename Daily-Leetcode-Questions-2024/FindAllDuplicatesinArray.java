package dailyLeetcodeQuestions2024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllDuplicatesinArray {

	public static void main(String[] args) {
		int nums[]= {4,3,2,7,8,2,3,1};
		List<Integer> list=findAllDuplicaesInArray(nums);
		System.out.println(list);
	}

	private static List<Integer> findAllDuplicaesInArray(int[] nums) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(!map.containsKey(nums[i])) map.put(nums[i], 1);
			else map.put(nums[i], map.get(nums[i])+1);
		}
		List<Integer> list=new ArrayList<>();
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()==2) {
				list.add(entry.getKey());
			}
		}
		System.out.println(map);
		return list;
	}

}
