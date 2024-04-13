package dailyTargatedLeetcodeQuestions;

import java.util.Arrays;

class ListNode10{
	int val;
	ListNode10 next;
	
	public ListNode10(int val) {
		this.val=val;
	}
}
public class RemoveLinkedListElements {

	public static void main(String[] args) {
		
		ListNode10 n1=new ListNode10(1);
		ListNode10 n2=new ListNode10(2);
		ListNode10 n3=new ListNode10(6);
		ListNode10 n4=new ListNode10(3);
		ListNode10 n5=new ListNode10(4);
		ListNode10 n6=new ListNode10(5);
		ListNode10 n7=new ListNode10(6);
		
		ListNode10 head=n1;
		n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=n6;n6.next=n7;
		n7.next=null;
		
		ListNode10 node=removeElement(head,6);
		display(node);
		
		
	}

	private static void display(ListNode10 node) {
		while(node!=null) {
			System.out.println(node.val);
			node=node.next;
		}
		
	}

	private static ListNode10 removeElement(ListNode10 head, int i) {
		if(head==null)
            return head;
		int count=0;
		ListNode10 temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		int arr[]=new int[count];
		temp=head;
		int pos=0;
		count=0;
		while(temp!=null) {
			if(temp.val!=i)	{
				arr[pos++]=temp.val;
				count++;
			}
			temp=temp.next;
		}
		 if(count==0)
	            return null;
		temp=head;
		
		pos=0;
		int var=count;
		System.out.println("Count="+count);
		while(count>0) {
			temp.val=arr[pos++];
			temp=temp.next;
			count--;
		}
		temp=head;
		int k=0;
		while(k!=var-1) {
			temp=temp.next;
			k++;
		}
		temp.next=null;
		return head;
	}

}
