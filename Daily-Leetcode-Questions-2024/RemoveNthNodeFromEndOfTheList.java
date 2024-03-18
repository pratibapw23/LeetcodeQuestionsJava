package dailyLeetcodeQuestions2024;


class ListNode1{
	int data;
	ListNode1 next;
	
	public ListNode1(int data) {
		this.data=data;
	}
}

public class RemoveNthNodeFromEndOfTheList {

	public static void main(String[] args) {
		
		ListNode1 n1=new ListNode1(1);
//		ListNode1 n2=new ListNode1(2);
//		ListNode1 n3=new ListNode1(3);
//		ListNode1 n4=new ListNode1(4);
//		ListNode1 n5=new ListNode1(5);
		
		ListNode1 head=n1;
		n1.next=null;
//		n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=null;
		int n=1;
		ListNode1 removedNthNode=removeNthNode(head,n);
		System.out.println("List after removing\t"+n+"\tnode from the last in list");
		displayList(removedNthNode);
	}


	private static ListNode1 removeNthNode(ListNode1 head, int n) {
		int count=0;
		ListNode1 curr=head;
		while(curr!=null) {
			count++;
			curr=curr.next;
		}
		if(n==1 && count==1) {
			head=null;
		}
		else if(n==1) {
			ListNode1 prev=head;
			for(int i=1;i<count-1;i++) {
				prev=prev.next;
			}
			prev.next=null;
			return head;
		}
		else if(n==count) {
			ListNode1 prev=head;
			head=prev.next;
			return head;
		}
		else {
			ListNode1 prev=head;
			int todel=count-n;
			for(int i=1;i<todel;i++) {
				prev=prev.next;
			}
			prev.next=prev.next.next;
		}
		return head;
	}

	private static void displayList(ListNode1 head) {
		ListNode1 curr=head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}

}
