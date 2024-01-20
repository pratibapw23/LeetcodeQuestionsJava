package dailyLeetcodeQuestions2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfSubarrayMinimums {

	public static void main(String[] args) {
		
		int arr[]= {11,81,94,43,3};
		int sum=sumOfSubarrayMinimums(arr);
		System.out.println(sum);

	}

	private static int sumOfSubarrayMinimums(int[] arr) {
		List<ArrayList<Integer>> subarrays=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			List<Integer> singleNums=new ArrayList<>();
			singleNums.add(arr[i]);
			subarrays.add(new ArrayList<Integer>(singleNums));
			for(int j=i+1;j<arr.length;j++) {
				List<Integer> list=new ArrayList<>();
				for(int k=i;k<=j;k++) {
					list.add(arr[k]);
				}
				subarrays.add(new ArrayList<Integer>(list));
			}
			
		}
		List<Integer> minimums=new ArrayList<>();
		for(ArrayList list:subarrays) {
			minimums.add((Integer) Collections.min(list));
		}
		int sum=0;
		for(Integer i:minimums) {
			sum+=i;
		}
//		System.out.println(minimums);
		return sum;
	}

}
