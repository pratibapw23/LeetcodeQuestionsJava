package dailyTargatedLeetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllDuplicatesInArray {

	public static void main(String[] args) {
		int nums[]= {4,3,2,7,8,2,3,1};
		int arr[]=findAllDuplicatesInArray(nums);
		System.out.println(Arrays.toString(arr));
		
	}

	private static int[] findAllDuplicatesInArray(int[] nums) {
		Arrays.sort(nums);
		List<Integer> list=new ArrayList<>();
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(!map.containsKey(nums[i])) map.put(nums[i], 1);
			else map.put(nums[i], map.get(nums[i])+1);
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()==2) {
				list.add(entry.getKey());
			}
		}
//		System.out.println(list);
		int arr[]=new int[list.size()];
		int pos=0;
		for(int i:list) {
			arr[pos]=i;
			pos++;
		}
		return arr;
	}

}
