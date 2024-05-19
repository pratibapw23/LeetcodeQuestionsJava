package dailyTargated.medium;

public class SumOfTwoIntegers {

	public static void main(String[] args) {
		int a = 1, b = 2;
		int result=sumOfTwoIntegers(a,b);
		System.out.println(result);
	}

	private static int sumOfTwoIntegers(int a, int b) {
		if(b>0) for(int i=0;i<b;i++) a++;
		else if(b<0) for(int i=0;i>b;i--) a--;
		return a;
	}

}
