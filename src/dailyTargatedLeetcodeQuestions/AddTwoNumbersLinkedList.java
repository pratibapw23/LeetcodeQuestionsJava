package dailyTargatedLeetcodeQuestions;

import java.util.Arrays;

class ListNode3{
	int data;
	ListNode3 next;
	
	public ListNode3(int data) {
		this.data=data;
	}
}
public class AddTwoNumbersLinkedList {

	public static void main(String[] args) {
		ListNode3 l1=new ListNode3(2);
		ListNode3 l2=new ListNode3(4);
		ListNode3 l3=new ListNode3(3);
		ListNode3 l4=new ListNode3(4);
		
		ListNode3 l11=new ListNode3(5);
		ListNode3 l12=new ListNode3(6);
		ListNode3 l13=new ListNode3(4);
		ListNode3 l14=new ListNode3(8);
		
		ListNode3 head1=l1; l1.next=l2;l2.next=l3;l3.next=null;l4.next=null;
		
		ListNode3 head2=l11; l11.next=l12;l12.next=l13;l13.next=null;l14.next=null;
		
		ListNode3 head3=addNumbers(head1,head2);
		displayList(head3);
	}

	private static void displayList(ListNode3 head3) {
		while(head3!=null) {
			System.out.println(head3.data);
			head3=head3.next;
		}
	}

	private static ListNode3 addNumbers(ListNode3 head1, ListNode3 head2) {
		int extradig=0;
		ListNode3 listnode=new ListNode3(0);
		ListNode3 temp=listnode;
		
		while(head1!=null || head2!=null || extradig!=0) {
			int sum=0;
			if(head1!=null) {
				sum+=head1.data;
				head1=head1.next;
			}
			if(head2!=null) {
				sum+=head2.data;
				head2=head2.next;
			}
			sum+=extradig;
			extradig=sum/10;
			ListNode3 node=new ListNode3(sum%10);
			temp.next=node;
			temp=node;
			
		}
		return listnode.next;
	}

}
