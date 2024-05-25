package dailyTargated.easy;

import java.util.Arrays;

public class ReshapeTheMatrix {

	public static void main(String[] args) {
		int [][] mat = {{1,2},{3,4}};
		int r = 2, c = 4;
		int result[][]=reshapeTheMatrix(mat,r,c);
		for(int arr[]:result) {
			System.out.println(Arrays.toString(arr));
		}
	}

	private static int[][] reshapeTheMatrix(int[][] mat, int r, int c) {
		int result[][]=new int[r][c];
		int a=0,b=0;
		if(mat.length*mat[0].length==r*c) {
			for(int i=0;i<mat.length;i++) {
				for(int j=0;j<mat[0].length;j++) {
					if(b==c) {
						a++;
						b=0;
					}
					result[a][b]=mat[i][j];
					b++;
				}
			}
			return result;
		}
		return mat;
	}

}
