package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

	public static void main(String[] args) {
		int nums[]= {1,2,2,4,4,3,4,4,4};
		int k=2;
		
		int elements[]=topKFrequentElements(nums,k);
		System.out.println(Arrays.toString(elements));
		
	}

	private static int[] topKFrequentElements(int[] nums, int k) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(!map.containsKey(nums[i])) map.put(nums[i], 1);
			else map.put(nums[i], map.get(nums[i])+1);
		}
		
//		Map<Integer,Integer> sortedMap=
//				map.entrySet().stream()
//				.sorted(Entry.comparingByValue())
//				.collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2) -> e1, LinkedHashMap::new));
//		System.out.println(sortedMap);
		
		 List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		 
		   Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
	           @Override
	           public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
	               return o2.getValue().compareTo(o1.getValue());
	           }
	       });
		   
		   int arr[]=new int[k];
		   int pos=0;
		   int count=0;
		   for (Map.Entry<Integer, Integer> entry : list) {
	           System.out.println(entry.getKey() + " : " + entry.getValue());
	           arr[pos]=entry.getKey();
	           count++;
	           pos++;
	           if(count==k)
	        	   break;
	       }
		
		return arr;
	}
	
}
