package dailyTargated.easy;

import java.util.Arrays;

public class SpecialPositionsInBinaryMatrix {

	public static void main(String[] args) {
		int mat[][] = {{1,0,0},{0,0,1},{1,0,0}};
		int count=specialPositionsInBinaryMatrix(mat);
		System.out.println(count);
	}

	private static int specialPositionsInBinaryMatrix(int[][] mat) {
		int count=0;
		int row[]=new int[mat.length];
		int col[]=new int[mat[0].length];
		
		for(int i=0;i<mat.length;i++) {
			int sum=0;
			for(int j=0;j<mat[0].length;j++) {
				sum+=mat[i][j];
			}
			row[i]=sum;
		}
		for(int i=0;i<mat[0].length;i++) {
			int sum=0;
			for(int j=0;j<mat.length;j++) {
				sum+=mat[j][i];
			}
			col[i]=sum;
		}
		System.out.println(Arrays.toString(row));
		System.out.println(Arrays.toString(col));
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				if(mat[i][j]==1 && row[i]==1 && col[j]==1) count++;
			}
		}
		return count;
	}

}
