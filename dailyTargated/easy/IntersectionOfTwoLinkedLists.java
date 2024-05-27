package dailyTargated.easy;

import java.util.HashSet;
import java.util.Set;

class ListNode{
	int val;
	ListNode next;
	
	public ListNode(int val) {
		this.val=val;
	}
}
public class IntersectionOfTwoLinkedLists {

	public static void main(String[] args) {
		ListNode n1=new ListNode(4);
		ListNode n2=new ListNode(1);
		
		ListNode n3=new ListNode(8);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		
		ListNode head1=n1;n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=null;
		
		ListNode n11=new ListNode(5);
		ListNode n12=new ListNode(6);
		ListNode n13=new ListNode(1);
		
		ListNode head2=n11;n11.next=n12;n12.next=n13;n13.next=n3;
		
		ListNode node=getInserctionNode(head1, head2);
		display(node);
		
	}

	private static ListNode getInserctionNode(ListNode head1, ListNode head2) {
		Set<ListNode> set=new HashSet<>();
		while(head1!=null) {
			set.add(head1);
			head1=head1.next;
		}
		while(head2!=null) {
			if(set.contains(head2)) {
				return head2;
			}
			head2=head2.next;
		}
		return null;
	}

	private static void display(ListNode head1) {
		ListNode temp=head1;
		while(temp!=null) {
			System.out.println(temp.val);
			temp=temp.next;
		}
	}

}
