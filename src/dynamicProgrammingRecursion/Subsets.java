package dynamicProgrammingRecursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subsets {

	public static void main(String[] args) {
		int nums[]= {1,2,3};
		List<List<Integer>> list=subsets(nums);
		System.out.println(list);
	}

	private static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result=new ArrayList<>();
		
		recurse(0, nums, result, new ArrayList<Integer>());
		return  result;
	}

	private static void recurse(int i, int[] nums, List<List<Integer>> result, ArrayList<Integer> arrayList) {
		result.add(new ArrayList<>(arrayList));
		
		for(int j=i;j<nums.length;j++) {
			arrayList.add(nums[j]);
			recurse(j+1, nums, result, arrayList);
			arrayList.remove(arrayList.size()-1);
		}
	}


}
