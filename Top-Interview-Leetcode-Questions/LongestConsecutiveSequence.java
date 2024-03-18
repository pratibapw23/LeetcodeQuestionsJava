package dailyTargatedLeetcodeQuestions;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int nums[]= {100,4,200,1,3,2};
		int count=longestConsecutiveSequence(nums);
		System.out.println(count);
	}

	private static int longestConsecutiveSequence(int[] nums) {
		int longestseq=0;
		int seq=0;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i:nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		for(int i=0;i<nums.length;i++) {
			int num=nums[i];
			seq=0;
			if(!map.containsKey(nums[i]-1)) {
				seq++;
				while(map.containsKey(num+1)) {
					seq++;
					num++;
				}
			}
			longestseq=Math.max(seq, longestseq);
		}
//		System.out.println(map);
		return longestseq;
	}

}
