package dailyTargated.medium;

public class IntegerBreak {

	public static void main(String[] args) {
		int n=10;
		int ans=integerBreak(n);
		System.out.println(ans);
	}

	private static int integerBreak(int n) {
		int a=1;
		if(n<=3) return n-1;
		while(n>4) {
			a*=3;
			n-=3;
		}
		a=a*n;
		return a;
	}

}
