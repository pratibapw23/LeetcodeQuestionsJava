package dailyTargatedLeetcodeQuestions;

public class ContainsDuplicatesII {

	public static void main(String[] args) {
		int nums[]= {1,2,3,1};
		int k=3;
		boolean res=containsDuplicates(nums,k);
		System.out.println(res);
	}

	private static boolean containsDuplicates(int[] nums, int k) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					if(j-i<=k) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
