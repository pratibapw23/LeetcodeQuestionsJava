package dailyTargatedLeetcodeQuestions;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		int nums[]= {3,1,3,4,2};
		int duplicate=findTheDuplicateNumber(nums);
		System.out.println(duplicate);
	}

	private static int findTheDuplicateNumber(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j])
					return nums[i];
			}
		}
		return 0;
	}

}
