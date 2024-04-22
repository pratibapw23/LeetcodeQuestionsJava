package dailyTargated.easy;

public class ToLowerCase {

	public static void main(String[] args) {
		String s = "Hello";
		String lower=toLowerCase(s);
		System.out.println(lower);
	}

	private static String toLowerCase(String s) {
		StringBuilder str=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char ch = 0;
			if((int)s.charAt(i)>=65 && (int) s.charAt(i)<=90) {
				ch=(char)((int)s.charAt(i)+32);
				str.append(ch);
			}
			else
				str.append(s.charAt(i));
			
		}
		return str.toString();
	}

}
