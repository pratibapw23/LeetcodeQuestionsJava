package dailyTargatedLeetcodeQuestions;

public class PartitionEqualSubsetSum {

	public static void main(String[] args) {
		int nums[]= {1,2,3,5};
		boolean res=partitionEqualSubsetSum(nums);
		System.out.println(res);
	}

	private static boolean partitionEqualSubsetSum(int[] nums) {
		int sum=0;
		for(int i=0;i<nums.length;i++)
			sum+=nums[i];
		if(sum%2==1)
			return false;
		
		
		return false;
	}

}
