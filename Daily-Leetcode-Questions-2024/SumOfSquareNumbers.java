package dailyLeetcodeQuestions2024;

public class SumOfSquareNumbers {

	public static void main(String[] args) {
		int c=5;
		boolean result=judgeSquareSum(c);
		System.out.println(result);
	}

	private static boolean judgeSquareSum(int c) {
		int left=0;
		long right=(long) Math.sqrt(c);
		while(left<=right) {
			long res=(left*left)+(right*right);
			if(res==c) return true;
			if(res>c) right--;
			else left++;
		}
		return false;
	}

}
