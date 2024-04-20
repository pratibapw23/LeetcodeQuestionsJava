package dailyTargatedLeetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RelativeSortArray {

	public static void main(String[] args) {
		int arr1[]= {26,21,11,20,50,34,1,18};
		int arr2[]= {21,11,26,20};
		int arr3[]=relativeSort(arr1,arr2);
		System.out.println(Arrays.toString(arr3));
	}

	private static int[] relativeSort(int[] arr1, int[] arr2) {
		List<Integer> arr1list=new ArrayList<>();
		for(int i:arr1)
			arr1list.add(i);
		List<Integer> ans=new ArrayList<>();
		for(int i=0;i<arr2.length;i++) {
			if(arr1list.contains(arr2[i])) {
				for(int j=0;j<arr1.length;j++) {
					if(arr1[j]==arr2[i]) {
						ans.add(arr1[j]);
					}
				}
			}
		}
		List<Integer> arr2list=new ArrayList<>();
		for(int i:arr2)
			arr2list.add(i);
		int extraelements=0;
		for(int i=0;i<arr1.length;i++) {
			if(!arr2list.contains(arr1[i])) {
				ans.add(arr1[i]);
				extraelements++;
			}
		}
		System.out.println(extraelements);
		int ansarr[]=ans.stream().mapToInt(i -> i).toArray();
		for(int i=ansarr.length-extraelements;i<ansarr.length;i++) {
			for(int j=ansarr.length-extraelements;j<ansarr.length;j++) {
				if(ansarr[i]<ansarr[j]) {
					int temp=ansarr[i];
					ansarr[i]=ansarr[j];
					ansarr[j]=temp;
				}
			}
//			if(ansarr[i]>ansarr[i+1]) {
//				int temp=ansarr[i];
//				ansarr[i]=ansarr[i+1];
//				ansarr[i+1]=temp;
//			}
		}
		return ansarr;
	}

}
