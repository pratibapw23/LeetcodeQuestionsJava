package dailyTargatedLeetcodeQuestions;

import java.util.Arrays;

class LinkedNode{
	int val;
	LinkedNode next;
	
	public LinkedNode(int val) {
		this.val=val;
	}
}

public class OddEvenLinkedList {

	public static void main(String[] args) {
		
		LinkedNode l1=new LinkedNode(1);
		LinkedNode l2=new LinkedNode(2);
		LinkedNode l3=new LinkedNode(3);
		LinkedNode l4=new LinkedNode(4);
		LinkedNode l5=new LinkedNode(5);
//		LinkedNode l6=new LinkedNode(6);
		
		LinkedNode head=l1;
		l1.next=l2;l2.next=l3;l3.next=l4;l4.next=l5;l5.next=null;//;l6.next=null;
//		display(head);
		LinkedNode node=oddEvenLinkedList(head);
		display(node);
		
	}

	private static LinkedNode oddEvenLinkedList(LinkedNode head) {
		LinkedNode curr=head;
		LinkedNode temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		int arr[]=new int[count];
		int pos=0;
		while(curr!=null && curr.next!=null) {
			arr[pos]=curr.val;
//			returnNode.next=curr;
			curr=curr.next.next;
			pos++;
		}
		if(count%2==1) {
			arr[pos]=curr.val;
			pos+=1;
		}
			
		
		LinkedNode curr2=head.next;
		
		while(curr2!=null && curr2.next!=null) {
			arr[pos]=curr2.val;
			curr2=curr2.next.next;
			pos++;
		}
		if(count%2==0)
			arr[pos]=curr2.val;
//		System.out.println(Arrays.toString(arr));
		temp=head;
		int i=0;
		while(temp!=null) {
			temp.val=arr[i];
			i++;
			temp=temp.next;
		}
		return head;
	}

	private static void display(LinkedNode head) {
		LinkedNode temp=head;
		while(temp!=null) {
			System.out.println(temp.val);
			temp=temp.next;
		}
	}

}
