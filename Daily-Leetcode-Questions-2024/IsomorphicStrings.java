package dailyLeetcodeQuestions2024;

import java.util.Arrays;

public class IsomorphicStrings {

	public static void main(String[] args) {
		String s = "egg", t = "add";
		boolean res=checkIsomorphicStrings(s,t);
		System.out.println(res);
	}

	private static boolean checkIsomorphicStrings(String s, String t) {
		if(s.length()!=t.length())
			return false;
		int arr1[]=new int[200];
		int arr2[]=new int[200];
		
		for(int i=0;i<s.length();i++) {
			if(arr1[s.charAt(i)]!=arr2[t.charAt(i)])
				return false;
			arr1[s.charAt(i)]=i+1;
			arr2[t.charAt(i)]=i+1;
		}
		System.out.println(Arrays.toString(arr1));
		return true;
	}

}
