package dailyLeetcodeQuestions2024;

public class NumOfStepsToReduceANumInBinaryReprToOne {

	public static void main(String[] args) {
		String s = "1101";
		int steps=numberOfSteps(s);
		System.out.println(steps);
	}

	private static int numberOfSteps(String s) {
		StringBuilder str=new StringBuilder(s);
		int count=0;
		while(str.length()>1) {
			int n=str.length();
			if(str.charAt(n-1)=='0') {
				devideByTwo(str);
			}
			else addOne(str);
			
			count++;
		}
		return count;
	}
	public static void devideByTwo(StringBuilder str) {
		str.deleteCharAt(str.length()-1);
	}
	public static void addOne(StringBuilder str) {
		int n=str.length()-1;
		while(n>=0 && str.charAt(n)!='0') {
			str.setCharAt(n, '0');
			n--;
		}
		if(n<0) str.insert(0, '1');
		else str.setCharAt(n, '1');
	}

}
