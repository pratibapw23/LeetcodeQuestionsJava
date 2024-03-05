package dailyTargatedLeetcodeQuestions;

class ListNode2{
	int data;
	ListNode2 next;
	
	public ListNode2(int data) {
		this.data=data;
	}
}
public class DeleteNodeInLinkedList {

	public static void main(String[] args) {

		ListNode2 l1=new ListNode2(4);
		ListNode2 l2=new ListNode2(5);
		ListNode2 l3=new ListNode2(1);
		ListNode2 l4=new ListNode2(9);
		
		ListNode2 head=l1;
		l1.next=l2;l2.next=l3;l3.next=l4;l4.next=null;
		
		deleteNode(l2);
		
	}

	private static void deleteNode(ListNode2 l2) {
		l2.data=l2.next.data;
		l2.next=l2.next.next;
		
		while(l2!=null) {
			System.out.println(l2.data);
			l2=l2.next;
		}
	}

}
