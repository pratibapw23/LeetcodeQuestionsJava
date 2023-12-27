package dailyLeetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class RopeColorful27Dec {

	public static void main(String[] args) {
		String colors = "aaabbbabbbb";
		int neededTime[] = {3,5,10,7,5,3,5,5,4,8,1};
		int mintime=findMinimumTimetoMakeRopeColorful(colors,neededTime);
		System.out.println(mintime);
	}

	private static int findMinimumTimetoMakeRopeColorful(String colors, int[] neededTime) {
		int sum=0;
		int n=colors.length();
		for(int i=0;i<colors.length()-1;i++) {
			if(colors.charAt(i)==colors.charAt(i+1)) {
				if(neededTime[i]<neededTime[i+1]) {
					sum+=neededTime[i];
				}
				else {
					sum+=neededTime[i+1];
					int temp=neededTime[i];
					neededTime[i]=neededTime[i+1];
					neededTime[i+1]=temp;
				}
			}
		}
		return sum; 
	}

}
