package dailyTargatedLeetcodeQuestions;

public class CountNumOfPairsWithAbsDiffOfK {

	public static void main(String[] args) {
		int nums[]= {3,2,1,5,4};
		int k=2;
		int count=countNumberOfPairsWithAbsDifferenceOfK(nums,k);
		System.out.println(count);
	}

	private static int countNumberOfPairsWithAbsDifferenceOfK(int[] nums, int k) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			int sum=0;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j])
					sum=nums[i]-nums[j];
				else
					sum=nums[j]-nums[i];
				if(sum==k)
					count++;
			}
		}
		return count;
	}

}
