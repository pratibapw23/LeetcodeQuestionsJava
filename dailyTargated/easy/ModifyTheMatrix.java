package dailyTargated.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ModifyTheMatrix {

	public static void main(String[] args) {
		int matrix[][] = {{1,2,-1},{4,-1,6},{7,8,9}};
		int [][] ans=modifyMatrix(matrix);
		for(int row[]:ans) {
			System.out.println(Arrays.toString(row));
		}
	}

	private static int[][] modifyMatrix(int[][] matrix) {
		int mat[]=new int[matrix[0].length];
		for(int i=0;i<matrix[0].length;i++) {
			for(int j=0;j<matrix.length;j++) {
				mat[j]=Math.max(mat[j], matrix[i][j]);
			}
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j]==-1) {
					matrix[i][j]=mat[j++];
				}
			}
		}
		return matrix;
	}

}
