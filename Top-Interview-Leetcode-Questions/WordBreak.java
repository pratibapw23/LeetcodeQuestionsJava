package dailyTargatedLeetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		String s="leetcode";
		List<String> wordDict=new ArrayList<>();
		wordDict.add("leet");
		wordDict.add("code");
		boolean res=wordBreak(s,wordDict);
		System.out.println(res);
	}

	private static boolean wordBreak(String s, List<String> wordDict) {
		
		int n=s.length();
		int maxWordLength=0;
		boolean dp[]=new boolean[n+1];
		dp[0]=true;
		
		//determine the length of maximum word in wordDict:
		
		for(String str:wordDict) {
			maxWordLength=Math.max(maxWordLength, str.length());
		}
//		System.out.println(maxWordLength);
		
		//Iterate the String s:
		
		for(int i=1;i<=n;i++) {
			for(int j=i-1;j>=Math.max(i-maxWordLength-1, 0);j--) {
				if(dp[j]) {
					if(wordDict.contains(s.substring(j, i))) {
						dp[i]=true;
						break;
					}
				}
			}
		}
		
		return dp[n];
	}

}
