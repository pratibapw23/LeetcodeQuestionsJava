package dailyTargated.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulbSwitcher {

	public static void main(String[] args) {
		int n=8;
		int res=bulbSwitcher(n);
		System.out.println(res);
	}

	private static int bulbSwitcher(int n) {
		if(n==1) return 1;
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++)
			list.add(1);
		for(int i=1;i<n;i+=2) {
			list.set(i, 0);
		}
		int pos=3;
		for(int i=2;i<n;i++) {
		for(int j=i;j<n;j+=pos) {
			if(list.get(j)==0) {
				list.set(j, 1);
				continue;
			}
			else if(list.get(j)==1) {
				list.set(j, 0);
				continue;
			}
		}
		pos++;
		}
		int sum=0;
		for(int i:list) sum+=i;
		return sum;
	}

}
