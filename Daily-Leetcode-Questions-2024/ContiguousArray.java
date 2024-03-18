package dailyLeetcodeQuestions2024;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

	public static void main(String[] args) {
		int nums[]= {0,1};
		int count=contiguoudArray(nums);
		System.out.println(count);
	}

	private static int contiguoudArray(int[] nums) {
		int maxlen=0;
		Map<Integer,Integer> map=new HashMap<>();
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) sum-=1;
			else sum+=1;
			if(sum==0) {
				maxlen=i+1;
			}
			else if(map.containsKey(sum)) {
				maxlen=Math.max(maxlen, 1-map.get(sum));
			}
			else
				map.put(sum, i);
		}
		
		return maxlen;
	}

}
