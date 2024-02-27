package dailyTargatedLeetcodeQuestions;

import java.util.Arrays;

public class ReplaceElementWithGreatestElemOnRightSide {

	public static void main(String[] args) {
		int nums[]= {400};
		int arr[]=replace(nums);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] replace(int[] nums) {
		int arr[]=new int[nums.length];
		int pos=0;
		outerloop:
		for(int i=0;i<nums.length;i++) {
			int max=-1;
			for(int j=i+1;j<nums.length;j++) {
				if(max<nums[j]) {
					max=nums[j];
				}
				
			}
			arr[pos]=max;
			pos++;
			continue outerloop;
		}
		return arr;
	}

}
