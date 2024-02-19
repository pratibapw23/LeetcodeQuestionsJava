package dailyTargatedLeetcodeQuestions;

import java.util.HashSet;

public class HappyNumber {

	public static void main(String[] args) {
		int n=19;
		System.out.println(isHappy(n));
	}

	private static boolean isHappy(int n) {
		
		HashSet<Integer> set=new HashSet<>();
		
		while(true) {
			int sum=0;
			while(n!=0) {
			sum+=Math.pow(n%10, 2.0);
			n=n/10;
			}
			if(sum==1)
				return true;
			n=sum;
			if(set.contains(n))
				return false;
			set.add(n);
		}
		
	}

}
