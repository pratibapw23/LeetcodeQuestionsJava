package dailyTargatedLeetcodeQuestions;

import java.util.Arrays;

class ListNode7{
	int val;
	ListNode7 next;
	
	public ListNode7(int val) {
		this.val=val;
	}
}
public class SwapNodesInPairs {

	public static void main(String[] args) {
		ListNode7 n1=new ListNode7(1);
		ListNode7 n2=new ListNode7(2);
		ListNode7 n3=new ListNode7(3);
		ListNode7 n4=new ListNode7(4);
		
		ListNode7 head=n1;
		n1.next=n2;n2.next=n3;n3.next=n4;n4.next=null;
		
		ListNode7 swap=swapNodesInPairs(head);
		displayList(swap);
	}

	private static ListNode7 swapNodesInPairs(ListNode7 head) {
		if(head==null || head.next==null)
			return head;
		int count=0;
		ListNode7 temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		int arr[]=new int[count];
		temp=head;
		int pos=0;
		while(temp!=null) {
			arr[pos++]=temp.val;
			temp=temp.next;
		}
//		System.out.println(Arrays.toString(arr));
		for(int i=0,j=1;j<arr.length;i+=2,j+=2) {
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
		}
		System.out.println(Arrays.toString(arr));
		temp=head;
		pos=0;
		while(temp!=null) {
			temp.val=arr[pos++];
			temp=temp.next;
		}
		return head;
	}

	private static void displayList(ListNode7 swap) {
		while(swap!=null) {
			System.out.println(swap.val);
			swap=swap.next;
		}
		
	}

}
