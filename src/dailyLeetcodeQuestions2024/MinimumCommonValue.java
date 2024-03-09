package dailyLeetcodeQuestions2024;

import java.util.HashSet;
import java.util.Set;

public class MinimumCommonValue {

	public static void main(String[] args) {
		int nums1[]= {1,2,3,6};
		int nums2[]= {2,3,4,5};
		int common=getCommon(nums1,nums2);
		System.out.println(common);
	}

	private static int getCommon(int[] nums1, int[] nums2) {
		
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<nums1.length;i++)
			set.add(nums1[i]);
		
		int min=Integer.MAX_VALUE;
		for(int i=0;i<nums2.length;i++) {
			if(set.contains(nums2[i])) {
				return nums2[i];
			}
		}
		return -1;
	}

}
