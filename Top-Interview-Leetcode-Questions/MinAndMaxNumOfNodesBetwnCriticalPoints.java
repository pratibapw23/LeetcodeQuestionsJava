package dailyTargatedLeetcodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ListNode4{
	int data;
	ListNode4 next;
	
	public ListNode4(int data) {
		this.data=data;
	}
}
public class MinAndMaxNumOfNodesBetwnCriticalPoints {

	public static void main(String[] args) {
		
		ListNode4 n1=new ListNode4(5);
		ListNode4 n2=new ListNode4(3);
		ListNode4 n3=new ListNode4(1);
		ListNode4 n4=new ListNode4(2);
		ListNode4 n5=new ListNode4(5);
		ListNode4 n6=new ListNode4(1);
		ListNode4 n7=new ListNode4(2);
		
		ListNode4 head=n1;
		n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=n6;n6.next=n7;n7.next=null;
		
		int arr[]=findMinAndMaxNoOfNodesBetweenCriticalPoints(head);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] findMinAndMaxNoOfNodesBetweenCriticalPoints(ListNode4 head) {
		ArrayList<Integer> counts=new ArrayList<>();
		ListNode4 ptr1=head;
		ListNode4 ptr2=head.next;
		int count=2;
		while(ptr2!=null && ptr2.next!=null ) {
			if(ptr2.data<ptr2.next.data && ptr2.data<ptr1.data) {
				counts.add(count);
			}
			else {
				if(ptr2.data>ptr2.next.data && ptr2.data>ptr1.data) {
					counts.add(count);
				}
			}
			ptr2=ptr2.next;
			ptr1=ptr1.next;
			count++;
		
		}
		
		System.out.println(counts);
		int arr[]=new int[2];
		if(counts.size()<2) {
			arr[1]=-1;
			arr[0]=-1;
			return arr;
		}
		 int minelem=Integer.MAX_VALUE;
	        for(int i=1;i<counts.size();i++){
	            minelem=Math.min(minelem,counts.get(i)-counts.get(i-1));
	        }
			arr[1]=counts.get(counts.size()-1)-counts.get(0);
			arr[0]=minelem;
			return arr;
	}

}
