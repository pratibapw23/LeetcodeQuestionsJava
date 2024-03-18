package dailyLeetcodeQuestions2024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheTownJudge {

	public static void main(String[] args) {
		int trust[][]= {{1,2}};
		int n=2;
		int judge=findTheTownJudge(trust,n);
		System.out.println(judge);
	}

	private static int findTheTownJudge(int[][] trust, int n) {
		int[] in = new int[n + 1];
        int[] out = new int[n + 1];
        for (int[] a : trust) {
            out[a[0]]++;
            in[a[1]]++;
        }
        for (int i = 1; i <= n; ++i) {
            if (in[i] == n - 1 && out[i] == 0)
                return i;
        }
        return -1;

}
}
