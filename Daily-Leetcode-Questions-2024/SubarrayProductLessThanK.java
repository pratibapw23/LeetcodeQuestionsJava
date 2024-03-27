package dailyLeetcodeQuestions2024;

public class SubarrayProductLessThanK {

	public static void main(String[] args) {
		int nums[]= {10,5,2,6};
		int k=100;
		
		int n=sunarrayProductLessThanK(nums,k);
		System.out.println(n);
	}

	private static int sunarrayProductLessThanK(int[] nums, int k) {
		int product=1;
		int count=0;
		if(k==0)
			return 0;
		for(int i=0;i<nums.length;i++) {
			product=1;
			for(int j=i;j<nums.length;j++) {
				product*=nums[j];
				if(product<k)
					count++;
				else break;
			}
		}
		return count;
	}

}
