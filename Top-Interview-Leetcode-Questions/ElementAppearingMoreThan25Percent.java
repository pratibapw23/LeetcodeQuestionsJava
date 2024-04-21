package dailyTargatedLeetcodeQuestions;

import java.util.HashMap;
import java.util.Map;

public class ElementAppearingMoreThan25Percent {

	public static void main(String[] args) {
		int arr[]= {1,2,2,6,6,6,6,7,10};
		int element=elementAppearingMoreThan25Percent(arr);
		System.out.println(element);
	}

	private static int elementAppearingMoreThan25Percent(int[] arr) {
		int qtr=arr.length/4;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(map);
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()>qtr)
				return entry.getKey();
		}
		return 0;
	}

}
