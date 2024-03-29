package dailyLeetcodeQuestions2024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSubarrysWhereMaxElemAppearsAtLeastKTimes {

	public static void main(String[] args) {
		int nums[]= {1,3,2,3,3};
		int k=2;
		int n=countSubarrays(nums,k);
		System.out.println(n);
	}

	private static int countSubarrays(int[] nums, int k) {
		Map<Integer,Integer> map=new HashMap<>();
		int count=0;
		int i=0;
		int j=0;
		int n=nums.length;
		int max=Arrays.stream(nums).max().getAsInt();
		while(j<n) {
			map.put(nums[j], map.getOrDefault(nums[j], 0)+1);
			while(map.getOrDefault(max, 0)>=k) {
				count+=n-j;
				map.put(nums[i], map.get(nums[i])-1);
				i++;
			}
			j++;
		}
		
		return count;
	}

}
