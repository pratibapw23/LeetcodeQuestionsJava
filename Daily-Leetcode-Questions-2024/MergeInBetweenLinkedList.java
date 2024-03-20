package dailyLeetcodeQuestions2024;

class LinkedListNode{
	int val;
	LinkedListNode next;
	
	public LinkedListNode(int val) {
		this.val=val;
	}
}
public class MergeInBetweenLinkedList {

	public static void main(String[] args) {
		LinkedListNode n1=new LinkedListNode(0);
		LinkedListNode n2=new LinkedListNode(1);
		LinkedListNode n3=new LinkedListNode(2);
		LinkedListNode n4=new LinkedListNode(3);
		LinkedListNode n5=new LinkedListNode(4);
		LinkedListNode n6=new LinkedListNode(5);
		LinkedListNode n7=new LinkedListNode(6);
		
		LinkedListNode list1=n1;
		n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=n6;n6.next=n7;
		n7.next=null;
		
		LinkedListNode m1=new LinkedListNode(1000000);
		LinkedListNode m2=new LinkedListNode(1000001);
		LinkedListNode m3=new LinkedListNode(1000002);
		LinkedListNode m4=new LinkedListNode(1000003);
		LinkedListNode m5=new LinkedListNode(1000004);
		
		LinkedListNode list2=m1;
		m1.next=m2;m2.next=m3;m3.next=m4;m4.next=m5;m5.next=null;
		
		int a=2,b=5;
		LinkedListNode node=mergeInBetweenLinkedList(list1,list2,a,b);
		display(node);
	}

	private static LinkedListNode mergeInBetweenLinkedList(LinkedListNode list1, LinkedListNode list2, int a, int b) {
		LinkedListNode prev=list1;
		for(int i=1;i<a;i++) {
			prev=prev.next;
		}
//		System.out.println(prev.val);
		LinkedListNode nextptr=list1;
		for(int i=0;i<=b;i++) {
			nextptr=nextptr.next;
		}
//		System.out.println(nextptr.val);
		LinkedListNode list2ptr=list2;
		while(list2ptr.next!=null) {
			list2ptr=list2ptr.next;
		}
		prev.next=list2;
		list2ptr.next=nextptr;
		list2=list1;
		return list2;
	}

	private static void display(LinkedListNode node) {
		while(node!=null) {
			System.out.println(node.val);
			node=node.next;
		}
		
	}

}
