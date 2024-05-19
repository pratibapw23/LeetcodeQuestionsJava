package dailyTargated.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArithmeticSubarrays {

	public static void main(String[] args) {
		int[] nums = {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10};
		int[] l = {0,1,6,4,8,7};
		int[] r = {4,4,9,7,9,10};
		List<Boolean> list=arithmeticSubarrays(nums,l,r);
		System.out.println(list);
	}

	private static List<Boolean> arithmeticSubarrays(int[] nums, int[] l, int[] r) {
		List<Boolean> ans=new ArrayList<>();
		int n=l.length;
		int pos=0;
		List<List<Integer>> list=new ArrayList<>();
			List<Integer> temp=new ArrayList<>();
			for(int j=0;j<l.length;j++) {
				for(int i=l[j];i<=r[j];i++) {
					temp.add(nums[i]);
				}
				list.add(new ArrayList<>(temp));
				temp.clear();
		}
			int flag=0;
		for(List<Integer> ls:list) {
			flag=0;
			Collections.sort(ls);
			System.out.println(ls);
			int diff=ls.get(1)-ls.get(0);
			for(int j=2;j<ls.size();j++) {
				if(ls.get(j)-ls.get(j-1)!=diff) flag=1;
			}
			if(flag==0) {
				ans.add(true);
			}
			else ans.add(false);
		}
//		System.out.println(list);
		return ans;
	}

}
