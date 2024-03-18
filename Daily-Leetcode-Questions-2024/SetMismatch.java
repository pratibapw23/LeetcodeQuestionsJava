package dailyLeetcodeQuestions2024;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMismatch {

	public static void main(String[] args) {
		int arr[]= {2,2};
		int nums[]=setMismatch(arr);
		System.out.println(Arrays.toString(nums));
	}

	private static int[] setMismatch(int[] arr) {
		int nums[]=new int[2];
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(!set.add(arr[i])) {
				nums[0]=arr[i];
			}
			set.add(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			if(!set.contains(i+1)) {
				nums[1]=i+1;
			}
		}
		
		return nums;
	}

}
