package dailyTargatedLeetcodeQuestions;

class ListNode{
	int data;
	ListNode next;
	
	public ListNode(int data) {
		this.data=data;
	}
}
public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {

		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(1);
		ListNode n3=new ListNode(2);
		ListNode n4=new ListNode(3);
		ListNode n5=new ListNode(3);
		
		ListNode head=n1;
		n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=null;
		
		ListNode newlist=removeDuplicates(head);
		displayList(newlist);
	}

	private static void displayList(ListNode newlist) {
		ListNode temp=newlist;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	private static ListNode removeDuplicates(ListNode head) {
		if(head==null)
			return head;
		ListNode temp=head;
		while(temp.next!=null) {
			if(temp.data==temp.next.data) {
				temp.next=temp.next.next;
			}
			else
				temp=temp.next;
		}
		return head;
	}

}
