package dailyLeetcodeQuestions2024;

import java.util.Arrays;

public class AssignCookies1Jan {

	public static void main(String[] args) {
		int g[]= {1,2}, s[]= {1,2,3};
		int maxCookies=assignCookies(g,s);
		System.out.println(maxCookies);
	}

	private static int assignCookies(int[] g, int[] s) {
		int i=0,j=0;
		Arrays.sort(s);
		Arrays.sort(g);
		while(i<s.length && j<g.length) {
			if(s[i]>=g[j]) {
				j++;
			}
			i++;
		}
		return j;
	}

}
