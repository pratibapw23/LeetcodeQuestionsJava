package dailyLeetcodeQuestions2024;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {

	public static void main(String[] args) {
		int[] nums = {23,2,6,4,7};
		int k = 13;
		boolean res=continuousSubarraySum(nums,k);
		System.out.println(res);
	}

	private static boolean continuousSubarraySum(int[] nums, int k) {
//		for(int i=0;i<nums.length;i++) {
//			int sum=nums[i];
//			for(int j=i+1;j<nums.length;j++) {
//				sum+=nums[j];
//				if(sum%k==0) return true;
//			}
//		}
//		return false;
		int sumarray[]=new int[nums.length];
		int modsumarray[]=new int[nums.length+1];
		sumarray[0]=nums[0];
		for(int i=1;i<nums.length;i++) {
			sumarray[i]=sumarray[i-1]+nums[i];
		}
		for(int i=0;i<sumarray.length;i++) {
			modsumarray[i]=sumarray[i]%k;
		}
		Map<Integer,Integer> map=new HashMap<>();
		map.put(0, 0);
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(modsumarray[i])) {
				if(i-map.get(modsumarray[i])>=2) return true;
				else map.put(modsumarray[i], i);
			}
		}
		
		return false;
	}

}
