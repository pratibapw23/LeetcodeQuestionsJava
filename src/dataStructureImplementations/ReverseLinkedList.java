package dataStructureImplementations;

class ListNode{
	int data;
	ListNode next;
	
	public ListNode(int data) {
		this.data=data;
	}
}

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		ListNode n1=new ListNode(10);
		ListNode n2=new ListNode(20);
		ListNode n3=new ListNode(30);
		ListNode n4=new ListNode(40);
		ListNode n5=new ListNode(50);
		
		ListNode head=n1;
		n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;
//		displayList(head);
		reverseLinkedList(head);
	}

	private static void displayList(ListNode head) {
		ListNode curr=head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	private static void reverseLinkedList(ListNode head) {
		ListNode curr=head;
		ListNode prev=null;
		
		while(curr!=null) {
			ListNode temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		displayList(prev);
	}

}
