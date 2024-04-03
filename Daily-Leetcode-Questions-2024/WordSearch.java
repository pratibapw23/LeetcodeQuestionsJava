package dailyLeetcodeQuestions2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordSearch {

	public static void main(String[] args) {
		char board[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCCED";
		boolean res=wordExist(board,word);
		System.out.println(res);
	}

	private static boolean wordExist(char[][] board, String word) {
		int m=board.length;
		int n=board[0].length;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j]==word.charAt(0) && solve(board,i,j,0,word)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean solve(char[][] board, int i, int j, int k, String word) {
		List<List<Integer>> list=new ArrayList<>();
		list.add(Arrays.asList(1,0));
		list.add(Arrays.asList(-1,0));
		list.add(Arrays.asList(0,1));
		list.add(Arrays.asList(0,-1));
		
		if(k==word.length())
			return true;
		if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]=='$')
			return false;
		if(board[i][j]!=word.charAt(k))
			return false;
		
		char t=board[i][j];
		board[i][j]='$';
		
		for(List<Integer> l:list) {
			int i1=i+l.get(0);
			int j1=j+l.get(1);
			
			if(solve(board, i1,j1, k+1,word))
				return true;
		}
		board[i][j]=t;
		
		return false;
	}

}
