package dailyLeetcodeQuestions2024;

import java.util.Arrays;

public class PolygonWithLargestPerimeter {

	public static void main(String[] args) {
		int nums[]= {1,12,1,2,5,50,3};
		long perimeter=polygonWithLargetPerimeter(nums);
		System.out.println(perimeter);
	}

	private static long polygonWithLargetPerimeter(int[] nums) {
		int n=nums.length;
		Arrays.sort(nums);
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=nums[i];
		}
		for(int i=n-1;i>=2;i--) {
			sum-=nums[i];
			if(sum>nums[i])
				return sum+nums[i];
		}
		return -1;
	}

}
	
