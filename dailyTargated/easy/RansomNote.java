package dailyTargated.easy;

public class RansomNote {

	public static void main(String[] args) {
		String ransomNote = "aa", magazine = "ab";
		boolean res=canConstruct(ransomNote, magazine);
		System.out.println(res);
	}

	private static boolean canConstruct(String ransomNote, String magazine) {
		int arr[]=new int[26];
		for(char c:ransomNote.toCharArray()) {
			arr[c-'a']++;
		}
		for(char c:magazine.toCharArray()) {
			arr[c-'a']--;
		}
		for(int num:arr) {
			if(num>0) return false;
		}
		return true;
	}

}
