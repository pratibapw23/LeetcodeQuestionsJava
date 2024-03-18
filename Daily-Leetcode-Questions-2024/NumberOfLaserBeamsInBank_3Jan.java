package dailyLeetcodeQuestions2024;

import java.util.ArrayList;

public class NumberOfLaserBeamsInBank_3Jan {

	public static void main(String[] args) {
		
		String bank[] = {"011001","000000","010100","001000"};
		int beams=numberOfLaserBeamsInBank(bank);
		System.out.println(beams);

	}

	private static int numberOfLaserBeamsInBank(String[] bank) {
		ArrayList<Integer> list=new ArrayList<>();
		int sum=0;
		int count=1;
		int m=1;
		for(int i=0;i<bank.length;i++) {
			count=0;
			String str=bank[i];
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='0') {
					continue;
				}
				else count++;
				
			}
			list.add(count);
//			System.out.println(count);
		}
		list.removeIf(integer -> integer.equals(0));
		for(int i=0;i<list.size()-1;i++) {
			m=list.get(i)*list.get(i+1);
			sum+=m;
		}
//		System.out.println(list);
//		System.out.println(sum);
		return sum;
	}

}
