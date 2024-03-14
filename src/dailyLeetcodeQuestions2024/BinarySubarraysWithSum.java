package dailyLeetcodeQuestions2024;

import java.util.ArrayList;
import java.util.List;

public class BinarySubarraysWithSum {

	public static void main(String[] args) {
		int nums[]= {0,0,0,0,0};
		int goal=0;
		int subarrays=binarySubarrayWithSum(nums,goal);
		System.out.println(subarrays);
	}

	private static int binarySubarrayWithSum(int[] nums, int goal) {
		int sum=0;
		List<List<Integer>> ans=new ArrayList<>();
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			
			for(int j=i;j<nums.length;j++) {
				sum=0;
				for(int k=i;k<=j;k++) {
					sum+=nums[k];
				}
				if(sum==goal) {
					for(int k=i;k<=j;k++) {
						list.add(nums[k]);
					}
					ans.add(new ArrayList<>(list));
					list.clear();
				}
				
			}
			
		}
		System.out.println(ans);
		return ans.size();
	}

}
