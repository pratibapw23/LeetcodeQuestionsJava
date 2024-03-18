package dailyTargatedLeetcodeQuestions;

public class CountNumberOfTeams {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4};
		int n=countNumberOfTeams(nums);
		System.out.println(n);
	}

	private static int countNumberOfTeams(int[] nums) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				for(int k=j+1;k<nums.length;k++) {
					if((nums[i]>nums[j] && nums[j]>nums[k]) || (nums[i]<nums[j] && nums[j]<nums[k])) {
						count++;
					}
				}
			}
		}
		return count;
	}

}
