package dailyTargatedLeetcodeQuestions;

import java.util.Arrays;

public class FindFirstAndLastPosOfElemInSortedArr {

	public static void main(String[] args) {
		int nums[]= {5,7,7,8,8,8,8,8,10};
		int target=8;
		int arr[]=searchRanges(nums,target);
		System.out.println(Arrays.toString(arr));

	}

	private static int[] searchRanges(int[] nums, int target) {
		
		int firstindex=binarySearchLeft(nums,target);
		int lastindex=binarySearchRight(nums,target);
		
		return new int[] {firstindex,lastindex};
	}

	private static int binarySearchLeft(int[] nums, int target) {
		int index=-1;
		int left=0,right=nums.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			
			if(nums[mid]==target) {
				index=mid;
				right=mid-1;
			}
			else if(nums[mid]<target) {
				left=mid+1;
			}
			else
				right=mid-1;
		}
		return index;
	}
	private static int binarySearchRight(int[] nums, int target) {
		int index=-1;
		int left=0,right=nums.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			
			if(nums[mid]==target) {
				index=mid;
//				right=mid-1;
				left=mid+1;
			}
			else if(nums[mid]<target) {
				left=mid+1;
			}
			else
				right=mid-1;
		}
		return index;
	}
	


}
