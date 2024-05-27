package dailyLeetcodeQuestions2024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SpecialArrayWithXElementsGreaterThanOrEqualToX {

	public static void main(String[] args) {
		
		int[] nums = {3,5};
		int num=specialArrayWithXElements(nums);
		System.out.println(num);
	}

	private static int specialArrayWithXElements(int[] nums) {
		Arrays.sort(nums);
		int totalCount=0;
		for(int i=1;i<=nums.length;i++) {
			totalCount=0;
			for(int j:nums) {
				if(j>=i) totalCount++;
			}
			if(totalCount==i) return totalCount;
		}
		return -1;
	}

}
