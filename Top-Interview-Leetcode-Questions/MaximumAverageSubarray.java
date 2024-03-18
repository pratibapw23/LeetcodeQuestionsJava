package dailyTargatedLeetcodeQuestions;

public class MaximumAverageSubarray {

	public static void main(String[] args) {
		int nums[]= {1,12,-5,-6,50,3};
		int k=4;
		double max=findMax(nums,k);
		System.out.println(max);
	}

	private static double findMax(int[] nums, int k) {
		double maxavg=Integer.MIN_VALUE;
		double sum=0;
		int pos=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
			if(i>=k-1) {
				maxavg=Math.max(maxavg, sum);
				sum-=nums[pos++];
			}
		}
		return (double)maxavg/k;
	}

}
