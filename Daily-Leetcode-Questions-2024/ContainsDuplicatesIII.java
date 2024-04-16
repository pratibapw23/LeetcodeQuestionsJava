package dailyLeetcodeQuestions2024;

public class ContainsDuplicatesIII {

	public static void main(String[] args) {
		int nums[]= {1,5,9,1,5,9};
		int indexdiff=2, valuediff=3;
		
		boolean res=containsDuplicates(nums,indexdiff,valuediff);
		System.out.println(res);
	}

	private static boolean containsDuplicates(int[] nums, int indexdiff, int valuediff) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(i!=j) {
					if((Math.abs(i-j)<=indexdiff) && Math.abs(nums[i]-nums[j])<=valuediff) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
