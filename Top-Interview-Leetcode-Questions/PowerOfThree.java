package dailyTargatedLeetcodeQuestions;

public class PowerOfThree {

	public static void main(String[] args) {
		
		int n=27;
		boolean res=powerOfThree(n);
		System.out.println(res);

	}

	private static boolean powerOfThree(int n) {
		
		if(n<3 && n!=1)
			return false;
		while(n>1) {
			if(n%3!=0) {
				return false;
			}
			n=n/3;
				
		}
		
		return true;
	}

}
