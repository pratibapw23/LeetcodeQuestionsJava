package dailyLeetcodeQuestions2024;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeightChecker {

	public static void main(String[] args) {
		int[] heights = {1,1,4,2,1,3};
		int count=heightChecker(heights);
		System.out.println(count);
	}

	private static int heightChecker(int[] heights) {
		int arr[]=Arrays.copyOf(heights, heights.length);
		Arrays.sort(arr);
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=heights[i]) count++;
		}
		return count;
	}

}
