package dailyTargatedLeetcodeQuestions;

import java.util.Arrays;

class ListNode1{
	int data;
	ListNode1 next;
	
	public ListNode1(int data) {
		this.data=data;
	}
}


public class MergeTwoSortedList {

	public static void main(String[] args) {
		
		ListNode1 ln1=new ListNode1(1);
		ListNode1 ln2=new ListNode1(2);
		ListNode1 ln3=new ListNode1(4);
		
		ListNode1 list1=ln1; ln1.next=ln2;ln2.next=ln3;ln3.next=null;
		
		ListNode1 mn1=new ListNode1(1);
		ListNode1 mn2=new ListNode1(3);
		ListNode1 mn3=new ListNode1(5);
		
		ListNode1 list2=mn1;mn1.next=mn2;mn2.next=mn3;mn3.next=null;
		
		sortLists(list1,list2);
	}

	private static void sortLists(ListNode1 list1, ListNode1 list2) {
		ListNode1 dummynode=new ListNode1(0);
		ListNode1 temp=dummynode;
		
		while(list1!=null && list2!=null) {
			if(list1.data<list2.data) {
				temp.next=list1;
				list1=list1.next;
			}
			else {
				temp.next=list2;
				list2=list2.next;
			}
			temp=temp.next;
		}
		if(list1!=null)
			temp.next=list1;
		else
			temp.next=list2;
		
		while(dummynode!=null) {
			System.out.println(dummynode.data);
			dummynode=dummynode.next;
		}
	}

//	private static void displayList(ListNode2 list2) {
//		ListNode2 head1=list2;
//		while(head1!=null) {
//			System.out.println(head1.data);
//			head1=head1.next;
//		}
//	}

}
