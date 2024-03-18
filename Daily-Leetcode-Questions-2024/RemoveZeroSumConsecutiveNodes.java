package dailyLeetcodeQuestions2024;

import java.util.HashMap;
import java.util.Map;

class ListNodeNew{
	int val;
	ListNodeNew next;
	
	public ListNodeNew(int val) {
		this.val=val;
	}
}
public class RemoveZeroSumConsecutiveNodes {

	public static void main(String[] args) {

		ListNodeNew n1=new ListNodeNew(1);
		ListNodeNew n2=new ListNodeNew(2);
		ListNodeNew n3=new ListNodeNew(3);
		ListNodeNew n4=new ListNodeNew(-3);
		ListNodeNew n5=new ListNodeNew(4);
		
		ListNodeNew head=n1;n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=null;
		ListNodeNew node=removeZeroSumConsecutive(head);
		display(node);
		
		
	}

	private static ListNodeNew removeZeroSumConsecutive(ListNodeNew head) {
		
		ListNodeNew temp=new ListNodeNew(0);
		temp.next=head;
		Map<Integer,ListNodeNew> map=new HashMap<>();
		int sum=0;
		map.put(sum, temp);
		ListNodeNew curr=temp;
		while(curr!=null) {
			sum+=curr.val;
			map.put(sum, curr);
			curr=curr.next;
		}
		curr=temp;
		sum=0;
		while(curr!=null) {
			sum+=curr.val;
			curr.next=map.get(sum).next;
			curr=curr.next;
		}
		
		return temp.next;
	}

	private static void display(ListNodeNew node) {
		while(node!=null) {
			System.out.println(node.val);
			node=node.next;
		}
	}

}
