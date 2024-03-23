package dailyLeetcodeQuestions2024;

import java.util.Arrays;

class ReorderListNode{
	int val;
	ReorderListNode next;
	
	public ReorderListNode(int val) {
		this.val=val;
	}
}
public class ReorderList {

	public static void main(String[] args) {
		ReorderListNode n1=new ReorderListNode(1);
		ReorderListNode n2=new ReorderListNode(2);
		ReorderListNode n3=new ReorderListNode(3);
		ReorderListNode n4=new ReorderListNode(4);
//		ReorderListNode n5=new ReorderListNode(5);
		ReorderListNode head=n1;n1.next=n2;n2.next=n3;n3.next=n4;n4.next=null;//n5.next=null;
		
		ReorderListNode node=reorderList(head);
		display(node);
	}

	private static ReorderListNode reorderList(ReorderListNode head) {
		if(head==null || head.next==null)
			return head;
		int count=0;
		ReorderListNode temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		int arr[]=new int[count];
		temp=head;
		int pos=0;
		while(temp!=null) {
			arr[pos++]=temp.val;
			temp=temp.next;
		}
		int i=0,j=arr.length-1;
		pos=1;
		int arr2[]=new int[arr.length];
		while(i<=j && pos<arr.length) {
			arr2[pos]=arr[j];
			arr2[pos-1]=arr[i];
			pos+=2;
			i++;
			j--;
		}
		if(arr.length%2==1) {
			arr2[arr.length-1]=arr[arr.length/2];
		}
		temp=head;
		pos=0;
		while(temp!=null) {
			temp.val=arr2[pos++];
			temp=temp.next;
		}
//		System.out.println(Arrays.toString(arr2));
		return head;
	}

	private static void display(ReorderListNode node) {
		while(node!=null) {
			System.out.println(node.val);
			node=node.next;
		}
		
	}

}
