package slidingWindowTechnique;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int nums[]= {1,3,-1,-3,5,3,6,7};
		int k=3;
		int arr[]=slidingWindowMax(nums,k);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] slidingWindowMax(int[] nums, int k) {
		int n=nums.length;
		List<Integer> list=new ArrayList<>();
		Deque<Integer> dq=new ArrayDeque<>();
		for(int i=0;i<n;i++) {
			while(!dq.isEmpty() && dq.getFirst()<=i-k) {
				dq.pollFirst();
			}
			while(!dq.isEmpty() && nums[i]>=nums[dq.getLast()]) {
				dq.pollLast();
			}
			dq.addLast(i);
			if(i>=k-1) {
				list.add(nums[dq.getFirst()]);
			}
		}
		System.out.println(list);
		int arr[]=new int[list.size()];
		int pos=0;
		for(int i:list) {
			arr[pos++]=i;
		}
		return arr;
	}

}
