package dailyLeetcodeQuestions2024;

public class FurthestBuildingYouCanReach {

	public static void main(String[] args) {
		int heights[]= {4,2,7,6,9,14,12};
		int bricks=5, ladders=1;
		int count=furthestBuildingYouCanReach(heights,bricks,ladders);
		System.out.println(count);
	}

	private static int furthestBuildingYouCanReach(int[] heights, int bricks, int ladders) {
		
		int n=heights.length;
		return findJumps(0, heights,bricks, ladders);
	}

	private static int findJumps(int i, int[] heights, int bricks, int ladders) {
		if(i==heights.length-1)
			return 0;
		
		if(heights[i+1]<=heights[i]) {
			return 1+findJumps(i+1, heights, bricks, ladders);
		}
		else {
			int byBricks=0;
			int byLadders=0;
			int diff=heights[i+1]-heights[i];
			if(bricks>=diff) {
				byBricks=1+findJumps(i+1, heights,bricks-diff,ladders);
			}
			if(ladders>=0) {
				byLadders=1+findJumps(i+1, heights, bricks, ladders-1);
			}
			
			return Math.max(byBricks, byLadders);
		}
		
	}

}
