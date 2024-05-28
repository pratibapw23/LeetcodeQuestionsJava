package dailyTargated.easy;

class ListNode2{
	int val;
	ListNode2 next;
	
	public ListNode2(int val){
		this.val=val;
	}
}
public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		ListNode2 n1=new ListNode2(1);
		ListNode2 n2=new ListNode2(1);
		ListNode2 n3=new ListNode2(2);
		
		ListNode2 head=n1;n1.next=n2;n2.next=n3;n3.next=null;
		ListNode2 node=removeDuplicates(head);
		display(node);
	}

	private static ListNode2 removeDuplicates(ListNode2 head) {
		if(head==null) return null;
		ListNode2 temp=head;
		while(temp!=null && temp.next!=null) {
			if(temp.val==temp.next.val) {
				temp.next=temp.next.next;
			}
			else
				temp=temp.next;
		}
		return head;
	}

	private static void display(ListNode2 node) {
		ListNode2 curr=node;
		while(curr!=null) {
			System.out.println(curr.val);
			curr=curr.next;
		}
	}

}
