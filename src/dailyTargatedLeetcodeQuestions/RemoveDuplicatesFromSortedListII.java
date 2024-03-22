package dailyTargatedLeetcodeQuestions;

class DupListNode{
	int val;
	DupListNode next;
	
	public DupListNode(int val) {
		this.val=val;
	}
}
public class RemoveDuplicatesFromSortedListII {

	public static void main(String[] args) {
		DupListNode n1=new DupListNode(1);
		DupListNode n2=new DupListNode(2);
		DupListNode n3=new DupListNode(3);
		DupListNode n4=new DupListNode(3);
		DupListNode n5=new DupListNode(4);
		DupListNode n6=new DupListNode(4);
		DupListNode n7=new DupListNode(5);
		
		DupListNode head=n1;n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=n6;
		n6.next=n7;n7.next=null;
		
		DupListNode node=removeDuplicatesFromSortedList(head);
		display(node);
		
	}

	private static void display(DupListNode node) {
		while(node!=null) {
			System.out.println(node.val);
			node=node.next;
		}
	}

	private static DupListNode removeDuplicatesFromSortedList(DupListNode head) {
		DupListNode extra =new DupListNode(0);
		extra.next=head;
		DupListNode curr=extra;
		DupListNode temp=head;
		while(temp!=null && temp.next!=null) {
			if(temp.next.val==temp.val) {
				while(temp.next!=null && temp.next.val==temp.val) {
					temp=temp.next;
				}
				curr.next=temp.next;
				temp=temp.next;
			}
			else {
				curr=curr.next;
				temp=temp.next;
			}
		}
		return extra.next;
	}

}
