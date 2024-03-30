package dailyLeetcodeQuestions2024;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithKDifferentIntegers {

	public static void main(String[] args) {
		int nums[]= {1,2,1,2,3},k=2;
		int n=subarraysWithKDistinct(nums,k);
		System.out.println(n);
	}

	private static int subarraysWithKDistinct(int[] nums, int k) {
		return slidingWindow(nums,k)-slidingWindow(nums,k-1);
	}

	//Total count of subarrays having <=k different Integers
	private static int slidingWindow(int[] nums, int k) {
		Map<Integer,Integer> map=new HashMap<>();
		int n=nums.length;
		int i=0,j=0;
		int ans=0;
		while(j<n) {
			map.put(nums[j], map.getOrDefault(nums[j], 0)+1);
			while(map.size()>k) {
				//shrink the Window:
				map.put(nums[i], map.get(nums[i])-1);
				if(map.get(nums[i])==0) {
					map.remove(nums[i]);
				}
				i++;
			}
			ans+=j-i+1;
			j++;
		}
		
		return ans;
	}

}
