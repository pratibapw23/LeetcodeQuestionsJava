package dailyLeetcodeQuestions2024;

public class CountSubarraysWithFixedBounds {

	public static void main(String[] args) {
		int nums[]= {1,1,1,1};
		int mink=1,maxk=1;
		long n=countSubarraysWithFixedBounds(nums,mink,maxk);
		System.out.println(n);
	}

	private static long countSubarraysWithFixedBounds(int[] nums, int mink, int maxk) {
		int minpos=-1,maxpos=-1,culidx=-1;
		long ans=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==mink) minpos=i;
			if(nums[i]==maxk) maxpos=i;
			if(nums[i]>maxk || nums[i]<mink) culidx=i;
			
			int s=Math.min(minpos, maxpos);
			int temp=s-culidx;
			ans+=temp<=0?0:temp;
		}
		return ans;
	}

}
