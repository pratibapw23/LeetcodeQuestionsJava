package dailyLeetcodeQuestions2024;

import java.util.Arrays;

public class TripletsThatCanFormTwoArraysOfEqualXOR {

	public static void main(String[] args) {
		int[] arr = {2,3,1,6,7};
		int triplets=findTriplets(arr);
		System.out.println(triplets);
	}

	private static int findTriplets(int[] arr) {
		int len=arr.length;
		int pref[]=new int[len+1];
		for(int i=0;i<len;i++) {
			pref[i+1]=pref[i]^arr[i];
		}
		System.out.println(Arrays.toString(pref));
		int count=0;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(pref[i]==pref[j+1]) {
					count+=(j-i);
				}
			}
		}
		return count;
	}

}
