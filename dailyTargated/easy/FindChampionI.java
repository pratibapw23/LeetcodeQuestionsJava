package dailyTargated.easy;

public class FindChampionI {

	public static void main(String[] args) {
		int[][] grid = {{0,1},{0,0}};
		int champ=findChampion(grid);
		System.out.println(champ);
	}

	private static int findChampion(int[][] grid) {
		int index=0;
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<grid.length;i++) {
			int sum=0;
			for(int j=0;j<grid[0].length;j++) {
				sum+=grid[i][j];
			}
			if(sum>maxsum) {
				maxsum=sum;
				index=i;
			}
		}
		return index;
	}

}
