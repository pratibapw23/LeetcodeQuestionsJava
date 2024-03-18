package dailyLeetcodeQuestions2024;

import java.util.HashMap;

public class ArithmaticSlicesII {

	public static void main(String[] args) {
		int nums[]= {2,4,6,8,10};
		int slices=numberOfArithmeticSlices(nums);
		System.out.println(slices);
	}
	public static int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int count = 0;
        HashMap<Integer, Integer>[] dp = new HashMap[n];
        for (int i = 0; i < n; ++i) {
            dp[i] = new HashMap<>();
        }
        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                long difference = (long) nums[i] - nums[j]; 

                if (difference > Integer.MAX_VALUE || difference < Integer.MIN_VALUE) {
                    continue; 
                }

                int dif = (int) difference;

                dp[i].put(dif, dp[i].getOrDefault(dif, 0) + 1);  
                if (dp[j].containsKey(dif)) {
                    dp[i].put(dif, dp[i].get(dif) + dp[j].get(dif));
                    count += dp[j].get(dif);
                }
            }
        }

        return count;
    }

}
