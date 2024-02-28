package dailyTargatedLeetcodeQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoOutOfThree {

	public static void main(String[] args) {
		int nums1[] = {3,1}, nums2[] = {2,3}, nums3[] = {1,2};
		List<Integer> arr=twoOutOfThree(nums1,nums2,nums3);
		System.out.println(arr);

}

	private static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
		Map<Integer,Integer> map=new HashMap<>();
		List<Integer> list=new ArrayList<>();
		
		
		for(int i=0;i<nums1.length;i++) {
			map.put(nums1[i], 1);
		}
		for(int i=0;i<nums2.length;i++) {
			if(map.containsKey(nums2[i])) {
				if(map.get(nums2[i])==1) {
				list.add(nums2[i]);
				map.put(nums2[i], 2);
				}
			}
		}
		for(int i=0;i<nums2.length;i++) {
			if(!map.containsKey(nums2[i])) {
				map.put(nums2[i], 1);
			}
		}
		for(int i=0;i<nums3.length;i++) {
			if(map.containsKey(nums3[i])) {
				if(map.get(nums3[i])==1) {
				list.add(nums3[i]);
				map.put(nums3[i], 2);
				}
			}
		}
		
		return list;
	}
}
