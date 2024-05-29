package dailyTargated.medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		int nums[] = {1,2,3};
		List<List<Integer>> resultList=permutations(nums);
		System.out.println(resultList);
	}

	private static List<List<Integer>> permutations(int[] nums) {
		List<List<Integer>> ans=new ArrayList<>();
		solve(ans, new ArrayList<Integer>(), nums);
		return ans;
	}

	private static void solve(List<List<Integer>> ans, ArrayList<Integer> arrayList, int[] nums) {
		if(arrayList.size()==nums.length) {
			ans.add(new ArrayList<Integer>(arrayList));
			return;
		}
		for(int num:nums) {
			if(arrayList.contains(num)) continue;
			arrayList.add(num);
			solve(ans, arrayList, nums);
			arrayList.remove(arrayList.size()-1);
		}
	}

}
