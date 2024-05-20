package dailyTargated.easy;

public class MatrixDiagonalSum {

	public static void main(String[] args) {
		int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=matrixDiagonalSum(matrix);
		System.out.println(sum);
	}

	private static int matrixDiagonalSum(int[][] matrix) {
		int sum=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(i==j || (i+j)==matrix.length-1) {
					sum+=matrix[i][j];
				}
			}
		}
		return sum;
	}

}
