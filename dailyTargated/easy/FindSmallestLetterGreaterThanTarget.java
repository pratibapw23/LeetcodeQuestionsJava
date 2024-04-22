package dailyTargated.easy;

public class FindSmallestLetterGreaterThanTarget {

	public static void main(String[] args) {
		char letters[]= {'c','f','j'};
		char target='c';
		char res=smallestLetterGreaterThanTarget(letters,target);
		System.out.println(res);
	}

	private static char smallestLetterGreaterThanTarget(char[] letters, char target) {
		for(int i=0;i<letters.length;i++) {
			if((int)letters[i]-(int)target>0)
				return letters[i];
		}
		return letters[0];
	}

}
