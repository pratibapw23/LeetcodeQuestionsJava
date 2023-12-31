/*
 * You are given an array prices where prices[i] is the price of a given 
 * stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy
 *  one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. 
 * If you cannot achieve any profit, return 0
 */
package com.leetcodeQuestions;
public class BestTimeToBuyAndSellStock {
	
	
	public static void main(String[] args) {
		int prices[]= {8,6,4,3,3,2,3,5,8,3,8,2,6};
		int profit=maxProfit(prices);
		System.out.println(profit);

	}

	private static int maxProfit(int[] prices) {
		
		int max=Integer.MAX_VALUE;
		int maxdiff=0;
		int diff=0;
		
		for(int i=0;i<prices.length;i++) {
			if(prices[i]<max) {
				max=prices[i];
			}
			maxdiff=prices[i]-max;
			System.out.println(prices[i]+"-"+max);
			if(diff<maxdiff)
				diff=maxdiff;
		}
		
//		LinkedHashMap<Integer, Integer> map=new LinkedHashMap<>();
//		ArrayList<Integer> list=new ArrayList<>();
//		int maxdiff=0;
//		for(int i=0;i<prices.length;i++) {
//			int current=prices[i];
//			boolean selected =false;
//			for(int j=i+1;j<prices.length;j++) {
//				if(prices[j]>current) {
//					selected=true;
//				}
//			}
//			if(selected==true) {
//				for(int j=i+1;j<prices.length;j++)
//				{
//					list.add(prices[j]);
//				}
//			}
//			int max=0;
//			if(!list.isEmpty()) {
//				max=Collections.max(list);
//			}
//			
//			if(selected==true)
//			{
//				map.put(current, max);
//				for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
//					int diff=entry.getValue()-entry.getKey();
//					if(diff>maxdiff)
//						maxdiff=diff;
//				}
//			}
//			list.clear();
//		}
////		int maxdiff=0;
////		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
////			int diff=entry.getValue()-entry.getKey();
////			if(diff>maxdiff)
////				maxdiff=diff;
////		}
//		System.out.println(map);
//		
//		return maxdiff;
		return diff;
	}

}
