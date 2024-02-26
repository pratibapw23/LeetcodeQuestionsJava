package dailyTargatedLeetcodeQuestions;

import java.util.Arrays;

public class KthLargestElementInArray {

	public static void main(String[] args) {
		int nums[]= {3,2,3,1,2,4,5,5,6};
		int k=4;
		int largest=kthLargetElement(nums,k);
		System.out.println(largest);
	}

	private static int kthLargetElement(int[] nums, int k) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums[k-1];
	}

}
