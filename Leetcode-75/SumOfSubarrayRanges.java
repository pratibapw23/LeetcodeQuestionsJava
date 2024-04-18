package dailyTargatedLeetcodeQuestions;

public class SumOfSubarrayRanges {

	public static void main(String[] args) {
		int nums[]= {1,3,3};
		long sum=sumofSubarrayRanges(nums);
		System.out.println(sum);
	}

	private static long sumofSubarrayRanges(int[] nums) {
		long sum=0;
		int min=0,max=0;
		for(int i=0;i<nums.length;i++) {
			min=nums[i];max=nums[i];
			for(int j=i;j<nums.length;j++) {
				min=Math.min(min, nums[j]);
				max=Math.max(max, nums[j]);
				sum+=max-min;
			}
		}
		return sum;
	}

}
