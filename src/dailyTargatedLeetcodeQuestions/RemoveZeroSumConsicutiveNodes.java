package dailyTargatedLeetcodeQuestions;

import java.util.HashMap;
import java.util.Map;

class ListNode5{
	int val;
	ListNode5 next;
	
	ListNode5(int val){
		this.val=val;
	}
}
public class RemoveZeroSumConsicutiveNodes {

	public static void main(String[] args) {
		ListNode5 n1=new ListNode5(1);
		ListNode5 n2=new ListNode5(2);
		ListNode5 n3=new ListNode5(3);
		ListNode5 n4=new ListNode5(-3);
		ListNode5 n5=new ListNode5(-2);
		
		ListNode5 head=n1;
		n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=null;
		ListNode5 node=removeZeroSumConsicutiveNodes(head);
		displayList(node);
	}

	private static void displayList(ListNode5 node) {
		while(node!=null) {
			System.out.println(node.val);
			node=node.next;
		}
	}

	private static ListNode5 removeZeroSumConsicutiveNodes(ListNode5 head) {
		
		ListNode5 startnode=new ListNode5(0);
		startnode.next=head;
		int prefixsum=0;
		Map<Integer,ListNode5> map=new HashMap<>();
		map.put(prefixsum, startnode);
		while(head!=null) {
			prefixsum+=head.val;
			map.put(prefixsum, head);
			head=head.next;
		}
		head=startnode;
		prefixsum=0;
		while(head!=null) {
			prefixsum+=head.val;
			head.next=map.get(prefixsum).next;
			head=head.next;
		}
		
		
		return startnode.next;
	}

}
