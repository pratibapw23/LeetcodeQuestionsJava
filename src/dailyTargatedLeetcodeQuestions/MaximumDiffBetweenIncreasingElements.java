package dailyTargatedLeetcodeQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumDiffBetweenIncreasingElements {

	public static void main(String[] args) {
		int nums[]= {1,5,2,10};
		int diff=maximumDifferenceBetweenIncreasingElements(nums);
		System.out.println(diff);
	}

	private static int maximumDifferenceBetweenIncreasingElements(int[] nums) {
		List<Integer> list=new ArrayList<>();
//		for(int i=1;i<nums.length;i++) {
//			if(nums[i-1]<nums[i]) {
//				if(!list.isEmpty())
//					list.add(Math.max(Collections.max(list), nums[i]-nums[i-1]));
//				else
//					list.add(nums[i]-nums[i-1]);
//			}
//		}
		
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					if(!list.isEmpty())
						list.add(Math.max(Collections.max(list), nums[j]-nums[i]));
					else
						list.add(nums[j]-nums[i]);
				}
			}
		}
		
		System.out.println(list);
		if(list.isEmpty())
			return -1;
		return Collections.max(list);
	}

}
