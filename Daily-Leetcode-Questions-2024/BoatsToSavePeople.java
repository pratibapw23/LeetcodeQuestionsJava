package dailyLeetcodeQuestions2024;

import java.util.Arrays;

public class BoatsToSavePeople {

	public static void main(String[] args) {
		int people[]= {3,5,3,4};
		int limit=5;
		int boats=boatsToSavePeople(people,limit);
		System.out.println(boats);
	}

	private static int boatsToSavePeople(int[] people, int limit) {
		Arrays.sort(people);
		int i=0,j=people.length-1;
		int count=0;
		while(i<=j) {
			if(people[i]+people[j]<=limit) {
				i++;
				
			}
			count++;
			j--;
		}
		return count;
	}

}
