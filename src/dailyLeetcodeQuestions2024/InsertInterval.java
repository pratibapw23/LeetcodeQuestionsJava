package dailyLeetcodeQuestions2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

	public static void main(String[] args) {
		int[][] intervals= {{1,2},{3,5},{6,7},{8,10},{12,16}};
		int[] newInterval= {4,8};
		int[][] res=insert(intervals,newInterval);
		System.out.println(Arrays.toString(res));
	}

	private static int[][] insert(int[][] intervals, int[] newInterval) {
		List<int[]> list=new ArrayList<>();
		int i=0,n=intervals.length;
		while(i<n && intervals[i][1]<newInterval[0]) {
			list.add(intervals[i]);
			i++;
		}
		while(i<n && newInterval[1]>=intervals[i][0]) {
			newInterval[0]=Math.min(newInterval[0], intervals[i][0]);
			newInterval[1]=Math.max(newInterval[1], intervals[i][1]);
			
			i++;
		}
		list.add(newInterval);
				while(i<n) {
			list.add(intervals[i]);
			i++;
		}
		for(int[] arr:list) {
			System.out.println(Arrays.toString(arr));
		}

		return list.toArray(new int[list.size()][]);
	}

}
