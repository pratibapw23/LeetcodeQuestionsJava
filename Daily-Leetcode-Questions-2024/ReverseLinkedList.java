package dailyLeetcodeQuestions2024;

class ReverseListNode{
	int val;
	ReverseListNode next;
	
	public ReverseListNode(int val) {
		this.val=val;
	}
}
public class ReverseLinkedList {

	public static void main(String[] args) {
		ReverseListNode n1=new ReverseListNode(1);
		ReverseListNode n2=new ReverseListNode(2);
		ReverseListNode n3=new ReverseListNode(3);
		ReverseListNode n4=new ReverseListNode(4);
		ReverseListNode n5=new ReverseListNode(5);
		
		ReverseListNode head=n1;n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=null;
		ReverseListNode node=reverseList(head);
		display(node);
	}

	private static void display(ReverseListNode node) {
		while(node!=null) {
			System.out.println(node.val);
			node=node.next;
		}
		
	}

	private static ReverseListNode reverseList(ReverseListNode head) {
		ReverseListNode prev=null;
		ReverseListNode curr=head;
		while(curr!=null) {
			ReverseListNode temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
	}

}
