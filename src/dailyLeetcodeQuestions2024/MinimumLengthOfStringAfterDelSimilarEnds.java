package dailyLeetcodeQuestions2024;

public class MinimumLengthOfStringAfterDelSimilarEnds {

	public static void main(String[] args) {
		String str="cacc";
		int len=minimumLengthOfStringAfterDeletingSimilarEnds(str);
		System.out.println(len);
	}

	private static int minimumLengthOfStringAfterDeletingSimilarEnds(String str) {
		int left=0;
		int right=str.length()-1;
		while(left<right && str.charAt(left)==str.charAt(right)) {
			char curr=str.charAt(left);
			while(left<=right && str.charAt(left)==curr) left++;
			while(left<=right && str.charAt(right)==curr) right--;
		}
		System.out.println("left="+left);
		System.out.println("right="+right);
		return Math.max(0, right-left+1);
	}

}
