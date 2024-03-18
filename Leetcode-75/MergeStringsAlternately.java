package leetcode75;

public class MergeStringsAlternately {

	public static void main(String[] args) {
		String word1 = "abc", word2 = "pqr";
		String str=mergeStrings(word1,word2);
		System.out.println(str);
	}

	private static String mergeStrings(String word1, String word2) {
		int minlen=word1.length()<word2.length()?word1.length():word2.length();
		
		StringBuilder str=new StringBuilder();
		int i=0;
		for(i=0;i<minlen;i++) {
			str.append(word1.charAt(i));
			str.append(word2.charAt(i));
		}
		
		String large=word1.length()>word2.length()?word1:word2;
		while(i<large.length()) {
			str.append(large.charAt(i));
			i++;
		}
		System.out.println(str);
		return str.toString();
	}

}
