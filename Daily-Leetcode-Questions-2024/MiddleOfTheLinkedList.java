package dailyLeetcodeQuestions2024;

class ListNode{
	int data;
	ListNode next;
	
	public ListNode(int data) {
		this.data=data;
	}
}
public class MiddleOfTheLinkedList {

	public static void main(String[] args) {
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		
		ListNode head=n1;n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;
		ListNode middleNode=findMiddleOfLinkedList(head);
		displaylist(middleNode);
	}

	private static ListNode findMiddleOfLinkedList(ListNode head) {
		ListNode fastptr=head;
		ListNode slowptr=head;
		while(fastptr!=null && fastptr.next!=null) {
			fastptr=fastptr.next.next;
			slowptr=slowptr.next;
		}
		return slowptr;
	}

	private static void displaylist(ListNode middleNode) {
		ListNode node=middleNode;
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}

}
