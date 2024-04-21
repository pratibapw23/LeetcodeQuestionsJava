package dynamicProgrammingRecursion;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		char s[]= {'h','e','l','l','o'};
		reverseString(s);
	}

	private static void reverseString(char[] s) {
		char ch[]=reverse(0,s.length-1,s);
		System.out.println(Arrays.toString(ch));
	}

	private static char[] reverse(int i, int j, char[] s) {
		if(i>j)
			return s;
		
		char temp=s[i];
		s[i]=s[j];
		s[j]=temp;
		
		reverse(i+1,j-1,s);
		
		return s;
	}

}
