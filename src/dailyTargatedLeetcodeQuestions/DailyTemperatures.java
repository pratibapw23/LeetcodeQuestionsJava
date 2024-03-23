package dailyTargatedLeetcodeQuestions;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

	public static void main(String[] args) {
		int tempretures[]= {30,60,90};
		int arr[]=dailyTempretures(tempretures);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] dailyTempretures(int[] tempretures) {
		int arr[]=new int[tempretures.length];
		int index=0;
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<tempretures.length;i++) {
			while(!st.isEmpty() && tempretures[i]>tempretures[st.peek()]) {
				index=st.pop();
				arr[index]=i-index;
			}
			st.push(i);
		}
		return arr;
	}

}
