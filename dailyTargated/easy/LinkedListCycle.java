package dailyTargated.easy;

import java.util.HashSet;
import java.util.Set;

class ListNode1{
	int val;
	ListNode1 next;
	
	public ListNode1(int val){
		this.val=val;
	}
}
public class LinkedListCycle {

	public static void main(String[] args) {
		ListNode1 n1=new ListNode1(3);
		ListNode1 n2=new ListNode1(2);
		ListNode1 n3=new ListNode1(0);
		ListNode1 n4=new ListNode1(-4);
		
		ListNode1 head=n1;
		n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n2;
		boolean result=hasCycle(head);
		System.out.println(result);
	}

	private static boolean hasCycle(ListNode1 head) {
		Set<ListNode1> set=new HashSet<>();
		while(head!=null) {
			if(!set.add(head)) return true;
			set.add(head);
			head=head.next;
		}
		return false;
	}

}
