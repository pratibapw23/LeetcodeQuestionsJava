package dailyTargated.easy;

public class MatrixCanBeObtainedByRotation {

	public static void main(String[] args) {
		int[][] mat = {{0,1},{1,0}}, target = {{1,0},{0,1}};
		boolean res=determineMatrixCanBeObtainedByRotation(mat,target);
		System.out.println(res);
	}

	private static boolean determineMatrixCanBeObtainedByRotation(int[][] mat, int[][] target) {
		for(int i=0;i<4;i++) {
			if(check(mat,target))
				return true;
			rotate(mat);
		}
		return false;
	}

	private static void rotate(int[][] mat) {
		//transpose matrix:
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<i;j++) {
				int temp=mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;
			}
		}
		//Flip the matrix elements until i!=j
		int start=0,end=mat.length-1;
		while(start<=end) {
			for(int i=0;i<mat.length;i++) {
				int temp=mat[i][start];
				mat[i][start]=mat[i][end];
				mat[i][end]=temp;
			}
			start++;
			end--;
		}
	}

	private static boolean check(int[][] mat, int[][] target) {
		int n=mat.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j]!=target[i][j]) return false;
			}
		}
		return true;
	}

}
