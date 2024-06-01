package dailyLeetcodeQuestions2024;

public class ScoreOfString {

	public static void main(String[] args) {
			String s = "hello";
			int score=findScoreOfString(s);
			System.out.println(score);
	}

	private static int findScoreOfString(String s) {
//		System.out.println((int)(s.charAt(0)));
		int i=0,j=1;
		int sum=0;
		while(i<j && j<s.length()) {
			sum+=Math.abs(s.charAt(i)-s.charAt(j));
			i++;j++;
		}
		return sum;
	}

}
