package dailyLeetcodeQuestions2024;

import java.util.Arrays;

public class HouseRobber {

	public static void main(String[] args) {
		int nums[]= {1,3,1};
		int amount=rob(nums);
		System.out.println(amount);
	}

	private static int rob(int[] nums) {
		if(nums.length==0)
			return 0;
		else if(nums.length==1)
			return nums[0];
		else if(nums.length==2)
			return Math.max(nums[0], nums[1]);
		int dp[]=new int[nums.length];
		dp[0]=nums[0];
		dp[1]=Math.max(nums[0], nums[1]);
		
		for(int i=2;i<nums.length;++i) {
			dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
		}
		System.out.println(Arrays.toString(dp));
		return dp[dp.length-1];
	}

}
