package dailyLeetcodeQuestions2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		int nums[]= {9,6,4,2,3,5,7,0,1};
		int missing=missingNumber(nums);
		System.out.println(missing);

	}

	private static int missingNumber(int[] nums) {
		
		int arr[]=new int[nums.length+1];
		for(int i=0;i<arr.length;i++)
			arr[i]=-1;
		for(int i=0;i<nums.length;i++) {
			arr[nums[i]]=nums[i];
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==-1)
				return i;
		}
		System.out.println(Arrays.toString(arr));
		return 0;
	}

}
