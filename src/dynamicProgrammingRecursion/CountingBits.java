package dynamicProgrammingRecursion;

import java.util.Arrays;

public class CountingBits {

	public static void main(String[] args) {
		int n=5;
		int arr[]=countBits(n);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] countBits(int n) {
		int arr[]=new int[n+1];
		arr[0]=0;
		
		for(int i=1;i<=n;i++) {
			String t=Integer.toBinaryString(i);
			int count=0;
			for(int j=0;j<t.length();j++) {
				if(t.charAt(j)=='1') {
					count++;
				}
			}
			arr[i]=count;
		}
		return arr;
	}

}
