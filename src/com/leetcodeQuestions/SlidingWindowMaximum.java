package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		
		int nums[] = {1,3,1,2,0,5}, k = 3;
		int arr[]=slidingWindowMax(nums,k);
		System.out.println(Arrays.toString(arr));

	}

	private static int[] slidingWindowMax(int[] nums, int k) {
		
		PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
		ArrayList<Integer> list=new ArrayList<>();
		int i=0;
		for(; i<k; i++)
			queue.add(nums[i]);
		list.add(queue.peek());
		queue.remove(nums[0]);
		System.out.println(i);
		for(; i<nums.length; i++) {
			queue.add(nums[i]);
			System.out.println("Queue element="+queue);
			list.add(queue.peek());
			queue.remove(nums[i-k+1]);
		}
		System.out.println(list);
		int arr[]=new int[list.size()];
		int pos=0;
		for(int j:list) {
			arr[pos]=j;
			pos++;
		}
			
		return arr;		
	}

}
