package dailyLeetcodeQuestions2024;

public class BitwiseAndOfNumbersRange {

	public static void main(String[] args) {
		int left=5,right=7;
		int output=bitwiseAndOfNumbersRange(left,right);
		System.out.println(output);
	}

	private static int bitwiseAndOfNumbersRange(int left, int right) {
		int shiftcount=0;
		
		while(left!=right) {
			left >>= 1;
			right >>= 1;
			shiftcount++;
		}
		return left << shiftcount;
	}

}
