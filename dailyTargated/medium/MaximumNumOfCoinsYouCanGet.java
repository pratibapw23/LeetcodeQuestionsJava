package dailyTargated.medium;

import java.util.Arrays;

public class MaximumNumOfCoinsYouCanGet {

	public static void main(String[] args) {
		int piles[] = {2,4,1,2,7,8};
		int coins=maximumNumOfCoins(piles);
		System.out.println(coins);
	}

	private static int maximumNumOfCoins(int[] piles) {
		Arrays.sort(piles);
		int sum=0;
		int i=0,j=piles.length-1,k=piles.length-2;
		while(i<k && k<j) {
			int secondMax=piles[k];
			sum+=secondMax;
			i++;
			j-=2;
			k-=2;
		}
		return sum;
	}

}
