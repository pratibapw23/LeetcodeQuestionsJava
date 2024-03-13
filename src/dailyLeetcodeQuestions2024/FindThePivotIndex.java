package dailyLeetcodeQuestions2024;

public class FindThePivotIndex {

	public static void main(String[] args) {
		int n=8;
		int index=findPivotIndex(n);
		System.out.println(index);
	}

	private static int findPivotIndex(int n) {
		
		int index=-1;
		for(int i=1;i<=n;i++) {
			int leftsum=0;
			int rightsum=0;
			
			for(int left=1;left<i;left++) {
				leftsum+=left;
			}
			for(int right=i+1;right<=n;right++) {
				rightsum+=right;
			}
			if(leftsum==rightsum)
				return i;
		}
		return index;
	}

}
