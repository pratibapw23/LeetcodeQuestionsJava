package dailyLeetcodeQuestions2024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayersWithZeroOrOneLosses {

	public static void main(String[] args) {
		
		int [][] arr= {{2,3},{1,3},{5,4},{6,4}};
		List<List<Integer>> list=findPlayersWithZeroOrOneLosses(arr);
		System.out.println(list);
	}

	private static List<List<Integer>> findPlayersWithZeroOrOneLosses(int[][] matches) {
		Map<Integer, Integer> losers = new HashMap<>();
        
        for (int[] m : matches) {
        	losers.putIfAbsent(m[0], 0);
        	losers.put(m[1], losers.getOrDefault(m[1], 0) + 1);
        }
        System.out.println(losers);
        List<Integer> zero = losers.entrySet().stream().filter(entry -> entry.getValue() == 0).map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());
        
        List<Integer> ones = losers.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());
        
        List<List<Integer>> result = new ArrayList<>();
        result.add(zero);
        result.add(ones);
        
        return result;
	}

}
