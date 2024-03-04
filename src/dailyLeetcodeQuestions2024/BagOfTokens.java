package dailyLeetcodeQuestions2024;

import java.util.Arrays;

public class BagOfTokens {

	public static void main(String[] args) {
		int tokens[]= {81,91,31};
		int power=73;
		
		int score=bagOfTokensScore(tokens,power);
		System.out.println(score);
	}

	private static int bagOfTokensScore(int[] tokens, int power) {
		Arrays.sort(tokens);
		int left=0,right=tokens.length-1;
		int score=0;
		int max=0;
		while(left<=right) {
			if(power>=tokens[left]) {
				power=power-tokens[left];
				score++;
				left++;
				max=Math.max(max, score);
			}
			else if(score>=1) {
				power+=tokens[right];
				score--;
				right--;
			}
			else
				break;
			
		}
		return max;
	}

}
