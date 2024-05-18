package dailyTargated.easy;

public class MinimumOperationsToExceedThresholdVal {

	public static void main(String[] args) {
		int nums[]= {2,11,10,1,3};
		int k=10;
		int minOper=minimumOperations(nums,k);
		System.out.println(minOper);
	}

	private static int minimumOperations(int[] nums, int k) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<k) count++;
		}
		return count;
	}

}
