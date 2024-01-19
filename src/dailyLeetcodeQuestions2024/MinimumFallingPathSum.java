package dailyLeetcodeQuestions2024;

import java.util.HashMap;

public class MinimumFallingPathSum {

	public static void main(String[] args) {
		
		int matrix[][]= {{2,1,3},{6,5,4},{7,8,9}};
		int minsum=minimumFaillingSum(matrix);
		System.out.println(minsum);
	}

	private static int minimumFaillingSum(int[][] matrix) {
		int r=matrix.length;
		int c=matrix[0].length;
		int ans=Integer.MAX_VALUE;
		HashMap<String,Integer> map=new HashMap<>();
		for(int i=0;i<c;i++) {
			ans=Math.min(ans, rec(0,i,matrix,map));
		}
		return ans;
	}
	private static int rec(int i,int j, int matrix[][],HashMap<String,Integer> map) {
		int r=matrix.length;
		int c=matrix[0].length;
		if(i==r)
			return 0;
		if(j <0 || j >=c) return Integer.MAX_VALUE;
        
		String k=i+"unique"+j;
		if(map.containsKey(k))
			return map.get(k);
		
        
        int op1 =  rec(i+1, j-1, matrix,map);
        int op2 =  rec(i+1, j,   matrix,map);
        int op3 =  rec(i+1, j+1, matrix,map);
   
        map.put(k, matrix[i][j]+Math.min(op1, Math.min(op2, op3)));
        return matrix[i][j] + Math.min(op1, Math.min(op2, op3));
	}

}
