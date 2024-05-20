package dailyTargated.easy;

import java.util.Arrays;

public class DeleteGreatestValueInEachRow {

	public static void main(String[] args) {
		int[][] grid = {{1,2,4},{3,3,1}};
		int sum=deleteGreatestValue(grid);
		System.out.println(sum);
	}

	private static int deleteGreatestValue(int[][] grid) {
		int sum=0;
		for(int row[]:grid)
			Arrays.sort(row);
		for(int row[]:grid)
			System.out.println(Arrays.toString(row));
		System.out.println(grid[0].length);
		for(int i=grid[0].length-1;i>=0;i--) {
			int max=0;
			for(int row[]:grid) {
				max=Math.max(max, row[i]);
			}
			sum+=max;
		}
		return sum;
	}

}
