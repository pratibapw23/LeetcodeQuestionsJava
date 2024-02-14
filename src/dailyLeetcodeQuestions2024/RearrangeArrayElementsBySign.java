package dailyLeetcodeQuestions2024;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RearrangeArrayElementsBySign {

	public static void main(String[] args) {
		int nums[]= {3,1,-2,-5,2,-4};
		int arr[]=rearrangeArrayElementsBySign(nums);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] rearrangeArrayElementsBySign(int[] nums) {
		int ans[]=new int[nums.length];
		int p=0;
		int n=1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>=0) {
				ans[p]=nums[i];
				p+=2;
			}
			else {
				ans[n]=nums[i];
				n+=2;
			}
		}
//		System.out.println(Arrays.toString(ans));
		return ans;
	}

}
