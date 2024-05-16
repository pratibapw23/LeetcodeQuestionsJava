package dailyTargated.easy;

public class SumOfValuesAtIndicesWithKSetBits {

	public static void main(String[] args) {
		int nums[]= {4,3,2,1};
		int k=2;
		int res=sumIndicesWithKSetBits(nums,k);
		System.out.println(res);
	}

	private static int sumIndicesWithKSetBits(int[] nums, int k) {
		int setbits=0;
		int sum=0;
		for(int j=0;j<nums.length;j++) {
			String str=Integer.toBinaryString(j);
//			System.out.println(str);
			setbits=0;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)-'0'==1) {
					setbits++;
				}
			}
//			System.out.println("setbit="+setbits);
			if(setbits==k) {
				sum+=nums[j];
			}
		}
		return sum;
	}

}
