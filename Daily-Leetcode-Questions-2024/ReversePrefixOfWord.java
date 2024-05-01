package dailyLeetcodeQuestions2024;

public class ReversePrefixOfWord {

	public static void main(String[] args) {
		String word = "abcdefd";
		char ch='d';
		String reversedPrefix=reversePrifixOfWord(word,ch);
		System.out.println(reversedPrefix);
	}

	private static String reversePrifixOfWord(String word, char ch) {
		int index=-1;
		char charry[]=word.toCharArray();
		StringBuffer str=new StringBuffer();
		for(int i=0;i<charry.length;i++) {
			if(charry[i]==ch) {
				index=i;
				break;
			}
		}
		System.out.println(index);
		if(index>-1) {
			for(int i=index;i>=0;i--) {
				str.append(charry[i]);
			}
		}
		for(int i=index+1;i<charry.length;i++) {
			str.append(charry[i]);
		}
		System.out.println(str);
		return str.toString();
	}

}
