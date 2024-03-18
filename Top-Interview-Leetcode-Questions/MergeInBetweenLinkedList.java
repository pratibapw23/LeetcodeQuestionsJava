package dailyTargatedLeetcodeQuestions;

class ListNode6{
	int val;
	ListNode6 next;
	
	public ListNode6(int val) {
		this.val=val;
	}
}
public class MergeInBetweenLinkedList {
	
	public static void main(String[] args) {
		
		ListNode6 n1=new ListNode6(0);
		ListNode6 n2=new ListNode6(1);
		ListNode6 n3=new ListNode6(2);
		ListNode6 n4=new ListNode6(3);
		ListNode6 n5=new ListNode6(4);
		ListNode6 n6=new ListNode6(5);
		ListNode6 n7=new ListNode6(6);
//		ListNode6 n8=new ListNode6(3);
//		ListNode6 n9=new ListNode6(8);
//		ListNode6 n10=new ListNode6(4);
		
		ListNode6 list1=n1;
		n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=n6;n6.next=n7;n7.next=null;//n8.next=n9;n9.next=n10;n10.next=null;
		
		ListNode6 n11=new ListNode6(1000000);
		ListNode6 n12=new ListNode6(1000001);
		ListNode6 n13=new ListNode6(1000003);
		ListNode6 n14=new ListNode6(1000004);
		ListNode6 n15=new ListNode6(1000005);
		
		ListNode6 list2=n11;
		n11.next=n12;n12.next=n13;n13.next=n14;n14.next=n15;n15.next=null;
		
		int a=2,b=5;
		ListNode6 mergedList=mergeInBetweenLinkedlist(list1, a, b, list2);
		displayList(mergedList);
		
	}

	private static ListNode6 mergeInBetweenLinkedlist(ListNode6 list1, int a, int b, ListNode6 list2) {
		ListNode6 prev=list1;
		for(int i=1;i<a;i++) {
			prev=prev.next;
		}
//		System.out.println(prev.val);
		ListNode6 nextptr=list1;
		for(int i=1;i<b+2;i++) {
			nextptr=nextptr.next;
		}
		ListNode6 prevtemp=list2;
		prev.next=prevtemp;
		list2=list1;
		
		ListNode6 nextlist2=list2;
		while(nextlist2.next!=null) {
			nextlist2=nextlist2.next;
		}
//		System.out.println(nextlist2.val);
		nextlist2.next=nextptr;
		return list2;
	}

	private static void displayList(ListNode6 mergedList) {
		while(mergedList!=null) {
			System.out.println(mergedList.val);
			mergedList=mergedList.next;
		}
	}

}
