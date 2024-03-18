package dailyLeetcodeQuestions2024;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int arr[]= {2,2,1,1,1,2,2};
		int n=majorityElement(arr);
		System.out.println(n);
	}

	private static int majorityElement(int[] arr) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) map.put(arr[i], 1);
			else map.put(arr[i], map.get(arr[i])+1);
		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()>(arr.length/2)) {
				return entry.getKey();
			}
				
		}
//		System.out.println(map);
		return 0;
	}

}
