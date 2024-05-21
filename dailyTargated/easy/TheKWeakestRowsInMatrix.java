package dailyTargated.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TheKWeakestRowsInMatrix {

	public static void main(String[] args) {
		int [][] mat = 
				{{1,1,0,0,0},
				 {1,1,1,1,0},
				 {1,0,0,0,0},
				 {1,1,0,0,0},
				 {1,1,1,1,1}};
		int k = 3;
		int arr[]=findKWeakestRowsInMatrix(mat,k);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] findKWeakestRowsInMatrix(int[][] mat, int k) {
		Map<Integer,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<mat.length;i++) {
			int count=0;
			for(int j=0;j<mat[0].length;j++) {
				if(mat[i][j]==1) {
					count++;
				}
			}
			map.put(i, count);
		}
		 List<Integer> list = new ArrayList<>(map.keySet());
		 System.out.println(list);
	      Collections.sort(list, (a, b) -> map.get(a) - map.get(b));
	      System.out.println(list);

	        int[] arr = new int[k];
	        for (int i = 0; i < k; i++) {
	            arr[i] = list.get(i);
	        }
		System.out.println(map);
		return arr;
	}

}
