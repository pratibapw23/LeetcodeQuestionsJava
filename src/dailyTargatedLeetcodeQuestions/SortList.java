package dailyTargatedLeetcodeQuestions;

import java.util.Arrays;

class Node2{
	int data;
	Node2 next;
	
	public Node2(int data) {
		this.data=data;
	}
}
public class SortList {

	public static void main(String[] args) {
		Node2 n1=new Node2(10);
		Node2 n2=new Node2(4);
		Node2 n3=new Node2(20);
		Node2 n4=new Node2(3);
		Node2 n5=new Node2(1);
		
		Node2 head=n1;n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=null;
		Node2 sorted=sortList(head);
		displayList(sorted);
	}

	private static void displayList(Node2 sorted) {
		Node2 temp=sorted;
		while(sorted!=null) {
			System.out.println(sorted.data);
			sorted=sorted.next;
		}
	}

	private static Node2 sortList(Node2 head) {
		int count=0;
		Node2 temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		int arr[]=new int[count];
		temp=head;
		int pos=0;
		while(temp!=null) {
			arr[pos++]=temp.data;
			temp=temp.next;
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		temp=head;
		pos=0;
		while(temp!=null) {
			temp.data=arr[pos];
			pos++;
			temp=temp.next;
		}
		return head;
	}
	

}
