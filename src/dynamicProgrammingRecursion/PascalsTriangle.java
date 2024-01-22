package dynamicProgrammingRecursion;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		int n=5;
		List<List<Integer>> list=pascalsTriangle(n);
		System.out.println(list);
	}

	private static List<List<Integer>> pascalsTriangle(int n) {
		List<List<Integer>> result=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			int dp[]=new int[i+1];
			
			dp[0]=1;
			dp[dp.length-1]=1;
			
			for(int j=1;j<dp.length-1;j++) {
				dp[j]=result.get(i-1).get(j-1)+result.get(i-1).get(j);
			}
			List<Integer> list=new ArrayList<>();
			for(int num:dp) {
				list.add(num);
			}
			result.add(list);
		}
//		System.out.println(result);
		return result;
	}

}
