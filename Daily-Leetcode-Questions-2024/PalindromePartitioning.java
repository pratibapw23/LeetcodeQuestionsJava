package dailyLeetcodeQuestions2024;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

	public static void main(String[] args) {
		String s = "aab";
		List<List<String>> ans=palindromePartitioning(s);
		System.out.println(ans);
	}

	private static List<List<String>> palindromePartitioning(String s) {
		List<List<String>> list=new ArrayList<>();
		solve(0, list, s, new ArrayList<String>());
		return list;
	}

	private static void solve(int i, List<List<String>> list, String s, List<String> arrayList) {
		if(s.length()==i) {
			list.add(new ArrayList<String>(arrayList));
			return;
		}
		for(int j=i;j<s.length();j++) {
			if(isPalindrom(s, i,j)) {
				arrayList.add(s.substring(i, j+1));
				solve(i+1, list, s, arrayList);
				arrayList.remove(arrayList.size()-1);
			}
		}
	}

	private static boolean isPalindrom(String s, int i, int j) {
		while(i<=j) {
			if(s.charAt(i++)!=s.charAt(j--)) return false;
		}
		return true;
	}

}
