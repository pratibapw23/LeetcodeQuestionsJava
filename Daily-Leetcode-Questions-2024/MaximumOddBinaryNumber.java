package dailyLeetcodeQuestions2024;

public class MaximumOddBinaryNumber {

	public static void main(String[] args) {
		String s = "0101";
		String oddNum=maximumOddBinaryNumber(s);
		System.out.println(oddNum);
	}

	private static String maximumOddBinaryNumber(String s) {
		StringBuffer str=new StringBuffer();
		int oneCount=0;
		int zeroCount=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='1')
				oneCount++;
			else
				zeroCount++;
		}
		for(int i=0;i<oneCount;i++)
			str.append('1');
		for(int i=0;i<zeroCount;i++)
			str.append('0');
		
		return str.toString();
	}

}
