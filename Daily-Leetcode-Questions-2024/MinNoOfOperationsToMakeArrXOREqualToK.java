package dailyLeetcodeQuestions2024;

public class MinNoOfOperationsToMakeArrXOREqualToK {

	public static void main(String[] args) {
		int nums[]= {2,1,3,4};
		int k=1;
		int operations=minOperations(nums,k);
		System.out.println(operations);
	}

	private static int minOperations(int[] nums, int k) {
		int count=k,result=0;
		for(int i:nums) {
			count^=i;
		}
		while(count!=0) {
			result+=count&1;
			System.out.println("result="+result);
			count>>=1;
			System.out.println("count="+count);
		}
		System.out.println(count);
		return result;
	}

}
