package dailyLeetcodeQuestions2024;

public class FirstPalindromicString {

	public static void main(String[] args) {
		String arr[]= {"abc","car","ada","racecar","cool"};
		String str=firstPalindromicStringInArray(arr);
		System.out.println(str);
	}

	private static String firstPalindromicStringInArray(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(isPalindrom(arr[i]))
				return arr[i];
		}
		return "";
	}

	private static boolean isPalindrom(String string) {
		int left=0;
		int right=string.length()-1;
		while(left<right) {
			if(string.charAt(left++)!=string.charAt(right--)) {
				return false;
			}
		}
		return true;
	}

}
