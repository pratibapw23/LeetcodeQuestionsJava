package dailyTargated.easy;

public class LicenseKeyFormatting {

	public static void main(String[] args) {
		String s = "---";
		int k = 3;
		String res=licenseKeyFormatting(s,k);
		System.out.println(res);
	}

	private static String licenseKeyFormatting(String s, int k) {
		StringBuilder str=new StringBuilder();
		for(char c:s.toCharArray()) {
			if(c=='-') continue;
			str.append(c);
		}
//		System.out.println(str);
		if(str.length()==0) return " ";
		StringBuilder str2=new StringBuilder();
		int count=0;
		for(int i=str.length()-1;i>=0;i--) {
			str2.append(Character.toUpperCase(str.charAt(i)));
			count++;
			if(count==k) {
				str2.append('-');
				count=0;
				continue;
			}
		}
		if(str2.charAt(str2.length()-1)=='-')
			str2.deleteCharAt(str2.length()-1);
		str2.reverse();
//		System.out.println(str2.reverse());
		
		return str2.toString();
	}

}
