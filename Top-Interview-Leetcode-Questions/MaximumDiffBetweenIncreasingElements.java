package dailyTargatedLeetcodeQuestions;

public class MaximumDiffBetweenIncreasingElements {

	public static void main(String[] args) {
		int nums[]= {7,1,5,4};
		int diff=maximumDifferenceBetweenIncreasingElements(nums);
		System.out.println(diff);
	}

	private static int maximumDifferenceBetweenIncreasingElements(int[] nums) {
		
		int diff=-1;
		int current=nums[0];
		
		for(int i=1;i<nums.length;i++) {
			if(current<nums[i])
				diff=Math.max(diff, nums[i]-current);
			current=Math.min(current, nums[i]);
		}
		
		return diff;
	}

}
