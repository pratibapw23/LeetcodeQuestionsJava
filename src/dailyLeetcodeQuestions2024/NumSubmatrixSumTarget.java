package dailyLeetcodeQuestions2024;

import java.util.ArrayList;
import java.util.List;

public class NumSubmatrixSumTarget {

	public static void main(String[] args) {
		int arr[][]= {{0,1,0},{1,1,1},{0,1,0}};
		int k=0;
		int submatrices=sumSubmatricesSumTarget(arr,k);
		System.out.println(submatrices);
	}

	private static int sumSubmatricesSumTarget(int[][] arr,int k) {
		
		int rows=arr.length;
		int cols=arr[0].length;
		
		List<ArrayList<Integer>> result=new ArrayList<>();
		
		
		for(int startrow=0;startrow<rows;startrow++) {
			for(int endrow=startrow;endrow<rows;endrow++) {
				for(int startcol=0;startcol<cols;startcol++) {
					for(int endcol=startcol;endcol<cols;endcol++) {
						List<Integer> list=new ArrayList<>();
						for(int i=startrow;i<=endrow;i++) {
							for(int j=startcol;j<=endcol;j++) {
								list.add(arr[i][j]);
							}
						}
						result.add(new ArrayList<>(list));
					}
				}
			}
		}
		
		int count=0;
		
		for(ArrayList<Integer> l:result) {
			int sum=0;
			for(int i=0;i<l.size();i++) {
				sum+=l.get(i);
			}
			if(sum==k)
				count++;
		}
		System.out.println(result);
		return count;
	}

}
