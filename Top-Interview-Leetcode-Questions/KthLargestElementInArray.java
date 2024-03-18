package dailyTargatedLeetcodeQuestions;

import java.util.Arrays;
import java.util.Collections;

public class KthLargestElementInArray {

	public static void main(String[] args) {
		int nums[]= {3,2,3,1,2,4,5,5,6};
		int k=4;
		int largest=kthLargetElement(nums,k);
		System.out.println(largest);
	}

	private static int kthLargetElement(int[] nums, int k) {
		int[] arrDesc = Arrays.stream(nums).boxed()
			    .sorted(Collections.reverseOrder())
			    .mapToInt(Integer::intValue)
			    .toArray();
		
		System.out.println(Arrays.toString(arrDesc));
		return arrDesc[k-1];
	}

}
