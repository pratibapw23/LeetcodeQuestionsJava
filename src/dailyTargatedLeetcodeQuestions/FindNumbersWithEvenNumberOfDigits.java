package dailyTargatedLeetcodeQuestions;

public class FindNumbersWithEvenNumberOfDigits {

	public static void main(String[] args) {
		int nums[]= {12,345,2,6,7896};
		int count=findNumbersWithEvenNumOfDigits(nums);
		System.out.println(count);
	}

	private static int findNumbersWithEvenNumOfDigits(int[] nums) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			String str=String.valueOf(nums[i]);
			if(str.length()%2==0) {
				count++;
			}
		}
		return count;
	}

}
