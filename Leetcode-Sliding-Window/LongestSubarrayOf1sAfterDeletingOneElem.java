package slidingWindowTechnique;

public class LongestSubarrayOf1sAfterDeletingOneElem {

	public static void main(String[] args) {
		int nums[]= {0,1,1,1,0,1,1,0,1};
		int len=findSubarray(nums);
		System.out.println(len);
	}

	private static int findSubarray(int[] nums) {
		int maxlen=0;
		int zerocount=0;
		int i=0,j=0;
		int n=nums.length;
		while(j<n) {
			if(nums[j]==0)
				zerocount++;
			while(zerocount>1) {
				if(nums[i]==0)
					zerocount--;
				i++;
			}
			maxlen=Math.max(maxlen, j-i);
			j++;
		}
		return maxlen;
	}

//	private static int findMax(int[] nums, int i) {
//		int maxlen=0;
//		int n=nums.length;
//		int count=0;
//		for(int i1=0;i1<nums.length;i1++) {
//			if(i1==i) {
//				continue;
//			}
//			if(nums[i1]==1) {
//				count++;
//				maxlen=Math.max(maxlen, count);
//			}
//			else
//				count=0;
//		}
//		return maxlen;
//	}

}
