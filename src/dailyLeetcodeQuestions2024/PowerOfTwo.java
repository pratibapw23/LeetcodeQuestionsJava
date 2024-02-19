package dailyLeetcodeQuestions2024;

public class PowerOfTwo {

	public static void main(String[] args) {
		int n=3;
		boolean res=powerOfTwo(n);
		System.out.println(res);

	}

	private static boolean powerOfTwo(int n) {
		for(int i=0;i<31;i++) {
			int temp=(int) Math.pow(2, i);
			if(n==temp) return true;
		}
		return false;
	}

}
