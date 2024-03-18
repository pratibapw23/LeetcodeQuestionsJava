package dailyTargatedLeetcodeQuestions;

import java.util.Arrays;

public class SortColors {

	public static void main(String[] args) {
		
		int nums[]= {2,0,2,1,1,0};
		sortColors(nums);
		

	}

	private static void sortColors(int[] nums) {
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		
	}

}
