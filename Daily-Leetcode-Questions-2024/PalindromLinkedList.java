package dailyLeetcodeQuestions2024;

import java.util.Arrays;

class PalinLinkedList{
	int val;
	PalinLinkedList next;
	
	public PalinLinkedList(int val) {
		this.val=val;
	}
}
public class PalindromLinkedList {

	public static void main(String[] args) {
		PalinLinkedList n1=new PalinLinkedList(1);
		PalinLinkedList n2=new PalinLinkedList(2);
		PalinLinkedList n3=new PalinLinkedList(2);
		PalinLinkedList n4=new PalinLinkedList(1);
		PalinLinkedList head=n1;
		n1.next=n2;n2.next=n3;n3.next=n4;n4.next=null;
		
		boolean res=isPalindromeLinkedList(head);
		System.out.println(res);
	}

	private static boolean isPalindromeLinkedList(PalinLinkedList head) {
		int count=0;
		PalinLinkedList temp=head;
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
		System.out.println(Arrays.toString(arr));
		int arr2[]=new int[arr.length];
		pos=0;
		for(int i=arr.length-1;i>=0;i--) {
			arr2[pos++]=arr[i];
		}
		System.out.println(Arrays.toString(arr2));
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr2[i])
				return false;
		}
		return true;
	}

}
