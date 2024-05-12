package dailyLeetcodeQuestions2024;

import java.util.Arrays;

public class LargestLocalValuesInMatrix {

	public static void main(String[] args) {
		int grid[][]= {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
		int [][] res=largestLocal(grid);
	}

	private static int[][] largestLocal(int[][] grid) {
		int rows=grid.length;
		int col=grid[0].length;
		
		int [][] res=new int[rows-2][col-2];
		for(int r=0;r<rows-2;r++) {
			for(int c=0;c<col-2;c++) {
				res[r][c]=findLargest(grid,r,c);
			}
		}
		return res;
	}

	private static int findLargest(int[][] grid, int r, int c) {
		int temp=grid[r][c];
		for(int i=r;i<r+3;i++) {
			for(int j=c;j<c+3;j++) {
				temp=Math.max(temp, grid[i][j]);
			}
		}
		return temp;
	}

}
