package dailyLeetcodeQuestions2024;

import java.util.HashMap;
import java.util.Map;

public class NumberOfWonderfulSubstrings {

	public static void main(String[] args) {
		String word = "ab";
		long count=numberOfWonderfulSubstrings(word);
		System.out.println(count);
	}

	private static long numberOfWonderfulSubstrings(String word) {
		int count[]=new int[1024];
        int m=0;
        count[0]=1;

        long result=0;

        for(char c:word.toCharArray()){
            m^=1<<(c-'a');
            result+=count[m];
            for(int i=0;i<10;i++){
                result+=count[m^(1<<i)];
            }
            count[m]++;
        }
        return result;
	}

}
