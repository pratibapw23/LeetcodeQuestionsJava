package dailyLeetcodeQuestions2024;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class RelativeRanks {

	public static void main(String[] args) {
		int score[]= {1};
		String[] ranks=relativeRanks(score);
		System.out.println(Arrays.toString(ranks));
	}

	private static String[] relativeRanks(int[] score) {
		Map<Integer,String> map=new LinkedHashMap<>();
		Integer[] scoreCopy=new Integer[score.length];
		for(int i=0;i<score.length;i++)
			scoreCopy[i]=score[i];
		Arrays.sort(scoreCopy,Collections.reverseOrder());
		System.out.println(Arrays.toString(scoreCopy));
		for(int i=0;i<scoreCopy.length;i++) {
			if(i>=3) {
				map.put(scoreCopy[i], Integer.toString(i+1));
			}
		}
		System.out.println(map);
		System.out.println("length of scoreCopy="+scoreCopy.length);
		if(scoreCopy.length==1)
		{
			map.put(scoreCopy[0], "Gold Medal");
		
		}else if(scoreCopy.length==2) {
			map.put(scoreCopy[0], "Gold Medal");
			map.put(scoreCopy[1], "Silver Medal");
		}
		else {
		map.put(scoreCopy[0], "Gold Medal");
		map.put(scoreCopy[1], "Silver Medal");
		map.put(scoreCopy[2], "Bronze Medal");
		}
		System.out.println(map);
		String ranks[]=new String[scoreCopy.length];
		int pos=0;
		for(int i=0;i<score.length;i++) {
			ranks[pos++]=map.get(score[i]);
		}
		return ranks;
	}

}
