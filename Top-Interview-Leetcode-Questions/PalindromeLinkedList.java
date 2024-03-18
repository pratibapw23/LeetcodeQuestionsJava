package dailyTargatedLeetcodeQuestions;

import java.util.Arrays;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data=data;
	}
}
public class PalindromeLinkedList {

	public static void main(String[] args) {
		
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(2);
		Node n4=new Node(1);
		
		Node head=n1;
		n1.next=n2;n2.next=n3;n3.next=n4;n4.next=null;
		displayLinkedList(head);
		boolean res=checkPalindrome(head);
		System.out.println(res);
	}

	private static boolean checkPalindrome(Node head) {
		Node curr=head;
		int count=0;
		while(curr!=null) {
			curr=curr.next;
			count++;
		}
		int arr1[]=new int[count];
		int arr2[]=new int[count];
		int pos=0;
		Node temp=head;
		while(temp!=null) {
			arr1[pos]=temp.data;
			temp=temp.next;
			pos++;
		}
		pos=0;
		for(int i=arr1.length-1;i>=0;i--) {
			arr2[pos]=arr1[i];
			pos++;
		}
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i])
				return false;
		}
//		System.out.println(Arrays.toString(arr2));
		return true;
	}

	private static void displayLinkedList(Node head) {
		Node curr=head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}

}
