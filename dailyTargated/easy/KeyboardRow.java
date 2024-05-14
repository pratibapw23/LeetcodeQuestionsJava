package dailyTargated.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {

	public static void main(String[] args) {
		String words[] = {"Hello","Alaska","Dad","Peace"};
		String res[]=findWords(words);
		System.out.println(Arrays.toString(res));
	}

	private static String[] findWords(String[] words) {
		List<Character> row1 = Arrays.asList('Q','W','E','R','T','Y','U','I','O','P');
		List<Character> row2 = Arrays.asList('A','S','D','F','G','H','J','K','L');
		List<Character> row3 = Arrays.asList('Z','X','C','V','B','N','M');
		List<String> result=new ArrayList<>();
		
		for(String str:words) {
			if((contains(str,row1))||(contains(str,row2))||(contains(str,row3))) {
				result.add(str);
			}
		}
		System.out.println(result);
		String res[]=new String[result.size()];
		int pos=0;
		for(String s:result) {
			res[pos++]=s;
		}
		return res;
	}

	private static boolean contains(String str, List<Character> row) {
		for(char c:str.toCharArray()) {
			if(!row.contains(Character.toUpperCase(c)))
				return false;
		}
		return true;
	}

}
