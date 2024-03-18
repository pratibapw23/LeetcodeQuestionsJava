package dailyLeetcodeQuestions2024;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ConvertArrayInto2DArray_2Jan {

	public static void main(String[] args) {
		int nums[]= {1,3,4,1,2,3,1};
		List<List<Integer>> list=findMatrix(nums);
		System.out.println(list);
	}

	private static List<List<Integer>> findMatrix(int[] nums) {
		List<List<Integer>> ans=new ArrayList<>();
		Map<Integer,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(!map.containsKey(nums[i]))
			{
				map.put(nums[i], 1);
			}
			else
				map.put(nums[i], map.get(nums[i])+1);
		}
		System.out.println(map);
		while(!map.isEmpty()) {
			int currval = 0;
			int currkey = 0;
			List<Integer> temp=new ArrayList<>();
			for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
				int key=entry.getKey();
				int val=entry.getValue();
				if(val>0) {
					temp.add(key);
					map.put(key, val-1);
				}
				currval=entry.getValue();
				currkey=entry.getKey();
			}
			
			if(currval<=0)
				map.remove(currkey);
			ans.add(temp);
		}
		ans.removeIf(List::isEmpty);
		return ans;
	}

}
