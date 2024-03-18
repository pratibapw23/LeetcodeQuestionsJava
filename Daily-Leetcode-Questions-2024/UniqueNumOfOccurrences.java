package dailyLeetcodeQuestions2024;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumOfOccurrences {

	public static void main(String[] args) {
		int arr[]= {1,2};
		boolean res=uniqueNumberOfOccurrences(arr);
		System.out.println(res);
	}

	private static boolean uniqueNumberOfOccurrences(int[] arr) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) map.put(arr[i], 1);
			else map.put(arr[i], map.get(arr[i])+1);
		}
		Set<Integer> set=new HashSet<>();
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(!set.add(entry.getValue()))
				return false;
		}
		return true;
	}

}
