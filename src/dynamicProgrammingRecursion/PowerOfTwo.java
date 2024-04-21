package dynamicProgrammingRecursion;

public class PowerOfTwo {

	public static void main(String[] args) {
		int n=18;
		boolean res=powerOfTwo(n);
		System.out.println(res);
	}

	private static boolean powerOfTwo(int n) {
		if(n==1)
			return true;
		if(n==0)
			return false;
		int num=n;
		return solve(n,num);
	}

	private static boolean solve(int n, int num) {
		if(n%2==0 && n==2 && num%2==0)
			return true;
		if(n%2!=0)
			return false;
		return solve(n/2,num);
	}

}
