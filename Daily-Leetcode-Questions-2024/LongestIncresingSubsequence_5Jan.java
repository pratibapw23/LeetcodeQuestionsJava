package dailyLeetcodeQuestions2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestIncresingSubsequence_5Jan {

	public static void main(String[] args) {
		
		int nums[]= {4,10,4,3,8,9};
		int len=lenghtOfLongestIncresingSubsequence(nums);
		System.out.println(len);

	}

	private static int lenghtOfLongestIncresingSubsequence(int[] nums) {
		int n= nums.length;
	      int arr[]=new int[n];
	      int index=0;
	      arr[0]=nums[0];
	            int len=1;
	      for(int i=1;i<n;i++){
	          if(nums[i]>arr[len-1]){
	        	  arr[len]=nums[i];
	              len++;
	          }else {
	         index=  findIndex(arr,0,len-1,nums[i]);
	         arr[index] = nums[i];
	      }
	      }
	      return len;    
	    }
	  public static int findIndex(int arr[],int left,int right,int k){
	      while(right>left){
	          int m= left+(right-left)/2;
	          if(arr[m]>=k){
	              right=m;
	          }else 
	          left=m+1;
	      }
	      return right;
	  }

}
