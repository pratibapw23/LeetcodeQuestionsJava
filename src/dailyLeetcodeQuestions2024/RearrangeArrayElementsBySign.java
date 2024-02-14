package dailyLeetcodeQuestions2024;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RearrangeArrayElementsBySign {

	public static void main(String[] args) {
		int nums[]= {1,-1};
		int arr[]=rearrangeArrayElementsBySign(nums);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] rearrangeArrayElementsBySign(int[] nums) {
//		List<Integer> positive=new LinkedList<>();
//		List<Integer> negative=new LinkedList<>();
		int arr[]=new int[nums.length];
		int positive[]=new int[nums.length/2];
		int negative[]=new int[nums.length/2];
		
		int pos=0;
		int neg=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>=0) {
				positive[pos]=nums[i];
				pos++;
			}
			else
			{
				negative[neg]=nums[i];
				neg++;
			}
		}
		int p=0;
		for(int i=0;i<positive.length;i++) {
			arr[p]=positive[i];
			p+=2;
		}
		int n=1;
		for(int i=0;i<negative.length;i++) {
			arr[n]=negative[i];
			n+=2;
		}
//		System.out.println(Arrays.toString(arr));
		
//		for(int i=0;i<nums.length;i++) {
//			if(nums[i]>=0)
//				positive.add(nums[i]);
//			else
//				negative.add(nums[i]);
//		}
////		System.out.println(positive+" "+negative);
//		int pos=0;
//		for(int i=0;i<positive.size();i++) {
//			arr[pos]=positive.get(i);
//			pos+=2;
//		}
//		int t=1;
//		for(int i=0;i<negative.size();i++) {
//			arr[t]=negative.get(i);
//			t+=2;
//		}
		return arr;
	}

}
