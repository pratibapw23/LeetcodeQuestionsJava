package dailyLeetcodeQuestions2024;

public class CompareVersionNumbers {

	public static void main(String[] args) {
		String version1 = "1.01", version2 = "1.001";
		int result=compareVersionNumbers(version1,version2);
		System.out.println(result);
	}

	private static int compareVersionNumbers(String version1, String version2) {
		 int i=0,j=0;
			while(i<version1.length() || j<version2.length()) {
				int temp1=0,temp2=0;
				while(i<version1.length() && version1.charAt(i)!='.') {
					temp1=temp1*10+(version1.charAt(i++)-'0');
				}
				while(j<version2.length() && version2.charAt(j)!='.') {
					temp2=temp2*10+(version2.charAt(j++)-'0');
				}
				i++;j++;
				if(temp1<temp2)
					return -1;
				if(temp1>temp2)
					return 1;
			}
			
			return 0;
	}

}
