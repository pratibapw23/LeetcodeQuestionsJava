package dailyTargatedLeetcodeQuestions;

public class FactorialTrailingZeros {

	public static void main(String[] args) {
		int n=21;
		int zeros=trailingZeros(n);
		System.out.println(zeros);
	}

	private static int trailingZeros(int n) {
		int ans=0;
		while(n!=0) {
			ans+=n/5;
			n/=5;
		}
		return ans;
	}

}
