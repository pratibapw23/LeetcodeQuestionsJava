package dailyTargatedLeetcodeQuestions;

public class FindPickElement {

	public static void main(String[] args) {
		int nums[]= {1,2};
		int pick=findPickElement(nums);
		System.out.println(pick);
	}

	private static int findPickElement(int[] nums) {
		int index=0;
		if(nums.length==2) {
			return nums[0]>nums[1]?0:1;
		}
		for(int i=1;i<nums.length-1;i++) {
			if(nums[i]>nums[i-1] && nums[i]>nums[i+1]) {
				index=i;
			}
		}
		return index;
	}

}
