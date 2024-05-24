package dailyTargated.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMissingAndRepeatedValues {

	public static void main(String[] args) {
		int[][] grid = {{1,3},{2,2}};
		int arr[]=findMissingAndRepeatedValues(grid);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] findMissingAndRepeatedValues(int[][] grid) {
		int arr[]=new int[2];
		int n=grid.length;
		int s1=0,s2=0;
		List<Integer> list=new ArrayList<>();
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(set.contains(grid[i][j])) {
					arr[0]=grid[i][j];
				}
				else
					set.add(grid[i][j]);
			}
		}
		for(int i=0;i<=n*n;i++) {
			s1+=i;
		}
		for(int i:set) {
			s2+=i;
		}
		arr[1]=s1-s2;
		return arr;
	}

}
