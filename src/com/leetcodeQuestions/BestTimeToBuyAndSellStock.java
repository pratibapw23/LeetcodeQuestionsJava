package com.leetcodeQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class BestTimeToBuyAndSellStock {
	
	
	public static void main(String[] args) {
		int prices[]= {2,1,4};
		int profit=maxProfit(prices);
		System.out.println(profit);

	}

	private static int maxProfit(int[] prices) {
		int max=-1;
		int diff=0;
		int m=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		for(int i=0;i<prices.length;i++)
			list.add(prices[i]);
		for(int i=0;i<list.size();i++) {
			int current=list.get(i);
			for(int j=i+1;j<list.size();j++) {
				list2.add(list.get(j));
			}
			if(!list2.isEmpty())
				max=Collections.max(list2);
			if(max>current) {
				diff=max-current;
			}
			if(diff>m) {
				m=diff;
				return m;
			}
				
			
			list2.clear();
		}
		return 0;
	}

}
