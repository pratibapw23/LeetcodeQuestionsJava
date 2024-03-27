package dailyLeetcodeQuestions2024;

import java.util.HashMap;

public class FirstMissingPositive {

	public static void main(String[] args) {
		int nums[]= {1};
		int n=firstMissingPositive(nums);
		System.out.println(n);
	}
	private static int firstMissingPositive(int[] nums) {
//		ArrayList<Integer> list=new ArrayList<>();
		int max=Integer.MIN_VALUE;
		HashMap<Integer,Boolean> map=new HashMap<>();
		for(int n:nums) {
//			list.add(n);
			map.put(n, true);
			max=Math.max(max, n);
		}
			
		for(int i=1;i<max;i++) {
			if(!map.containsKey(i))
				return i;
		}
		return max<0?1:max+1;
	}

}
