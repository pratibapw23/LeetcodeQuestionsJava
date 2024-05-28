package dailyTargated.medium;

import java.util.HashSet;
import java.util.Set;

public class FindUniqueBinaryString {

	public static void main(String[] args) {
		String nums[] = {"111","011","001"};
		String uniqueBinary=findUniqueBinaryString(nums);
		System.out.println(uniqueBinary);
	}

	private static String findUniqueBinaryString(String[] nums) {
		StringBuilder result = new StringBuilder();
        for(int i = 0; i< nums.length; i++){
            if(nums[i].charAt(i) == '0') result.append('1');
            else result.append('0');
        }
        return result.toString();
	}

}
