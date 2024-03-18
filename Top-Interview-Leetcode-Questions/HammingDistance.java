package dailyTargatedLeetcodeQuestions;

public class HammingDistance {

	public static void main(String[] args) {
		int x=1, y=4;
		int dist=hammingDistance(x,y);
		System.out.println(dist);

	}

	private static int hammingDistance(int x, int y) {
		
		int ans=x^y;
		System.out.println(ans);
		String str=Integer.toBinaryString(ans);
		int setbits=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='1')
				setbits++;
		}
		return setbits;
		
	}

}
