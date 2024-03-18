package dailyLeetcodeQuestions2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int nums1[]= {4,9,5};
		int nums2[]= {9,4,9,8,4};
		
		int intersections[]=intersectionOfTwoArrays(nums1,nums2);
		System.out.println(Arrays.toString(intersections));
	}

	private static int[] intersectionOfTwoArrays(int[] nums1, int[] nums2) {
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<nums1.length;i++) {
			set.add(nums1[i]);
		}
		Set<Integer> list=new HashSet<>();
		for(int i=0;i<nums2.length;i++) {
			if(set.contains(nums2[i])) {
				list.add(nums2[i]);
			}
		}
//		System.out.println(list);
		int arr[]=new int[list.size()];
		int pos=0;
		for(int i:list) {
			arr[pos++]=i;
		}
		return arr;
	}

}
