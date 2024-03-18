package dailyTargatedLeetcodeQuestions;

import java.util.Arrays;

public class HowNamyNumsSmallerThanCurrNum {

	public static void main(String[] args) {
		int nums[]= {6,5,4,8};
		int arr[]=numbersSmallerThanCurrentNumber(nums);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] numbersSmallerThanCurrentNumber(int[] nums) {
		
		int arr[]=new int[nums.length];
		int pos=0;
		for(int i=0;i<nums.length;i++) {
//			int current=nums[i];
			int count=0;
			for(int j=0;j<nums.length;j++) {
				if(i==j) continue;
				if(nums[i]>nums[j]) {
//					
					count++;
					
				}
			}
			arr[pos]=count;
			pos++;
		}
		return arr;
	}
	

}
