package dailyLeetcodeQuestions2024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CustomSortString {

	public static void main(String[] args) {
		String order="cba";
		String s="abcd";
		String str=customSortString(order,s);
		System.out.println(str);
	}

	private static String customSortString(String order, String s) {
		int index=1;
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<order.length();i++) {
			map.put(order.charAt(i), index++);
		}
		StringBuilder s1=new StringBuilder();
		char ch[]=s.toCharArray();
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(map.containsKey(ch[i]) && map.containsKey(ch[j])) {
					if(map.get(ch[i])>map.get(ch[j])) {
						char temp=ch[i];
						ch[i]=ch[j];
						ch[j]=temp;
					}
				}
			}
		}
		for(int i=0;i<ch.length;i++)
			s1.append(ch[i]);
		
//		System.out.println(Arrays.toString(ch));
		return s1.toString();
	}

}
