package dailyTargatedLeetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MeanOfArrayAfterRemovingSomeElements {

	public static void main(String[] args) {
		int arr[]= {4,8,4,10,0,7,1,3,7,8,8,3,4,1,6,2,1,1,8,0,9,8,0,3,9,10,3,10,1,10,7,3,2,1,4,9,10,7,6,4,0,8,5,1,2,1,6,2,5,0,7,10,9,10,3,7,10,5,8,5,7,6,7,6,10,9,5,10,5,5,7,2,10,7,7,8,2,0,1,1};
		double mean=meanOfTheArray(arr);
		System.out.println(mean);
	}

	private static double meanOfTheArray(int[] arr) {
		double mean=0;
		int n=arr.length;
		int todelete=((n/20));
		double sum=0;
		double n1=0;
		Arrays.sort(arr);
		for(int i=todelete;i<n-todelete;i++) {
			sum+=arr[i];
			n1++;
		}
		mean=sum/n1;
		return mean;
	}

}
