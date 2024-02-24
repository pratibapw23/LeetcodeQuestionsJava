package dailyTargatedLeetcodeQuestions;

import java.util.Arrays;

public class FindFirstAndLastPosOfElemInSortedArr {

	public static void main(String[] args) {
		int nums[]= {5,7,7,8,8,8,8,8,10};
		int target=0;
		int arr[]=searchRanges(nums,target);
		System.out.println(Arrays.toString(arr));

	}

	private static int[] searchRanges(int[] nums, int target) {
		
		int arr[]=new int[2];
		arr[0]=-1;
		arr[1]=-1;
		
		int firstindex=-1;
		int lastindex=-1;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				firstindex=i;
				break;
			}
		}
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				lastindex=i;
			}
		}
		arr[0]=firstindex;
		arr[1]=lastindex;
		return arr;
	}


}
