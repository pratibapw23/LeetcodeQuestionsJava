package slidingWindowTechnique;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		int nums[]= {2,3,1,2,4,3};
		int target=7;
		int n=minimumSizeSUbarraySum(nums,target);
		System.out.println(n);
	}

	private static int minimumSizeSUbarraySum(int[] nums, int target) {
		int i=0,j=0;
		
		int n=nums.length;
		int sum=0;
		int minlen=Integer.MAX_VALUE;
		while(j<n) {
			sum+=nums[j];
			while(sum>=target) {
				minlen=Math.min(minlen, j-i+1);
				sum-=nums[i];
				i++;
			}
			j++;
		}
		return minlen==Integer.MAX_VALUE?0:minlen;
	}

}
