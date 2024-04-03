package dailyTargatedLeetcodeQuestions;

import java.util.Arrays;

class ListNodeRot{
	int data;
	ListNodeRot next;
	
	public ListNodeRot(int data) {
		this.data=data;
	}
}
public class RotateList {

	public static void main(String[] args) {
		
		ListNodeRot n1=new ListNodeRot(1);
		ListNodeRot n2=new ListNodeRot(2);
		ListNodeRot n3=new ListNodeRot(3);
		ListNodeRot n4=new ListNodeRot(4);
		ListNodeRot n5=new ListNodeRot(5);
		ListNodeRot head=n1;
		n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=null;
		
		ListNodeRot node=rotateList(head,2);
		display(node);
	}

	private static void display(ListNodeRot node) {
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		
	}

	private static ListNodeRot rotateList(ListNodeRot head, int i) {
		if(head==null || i==0)
			return head;
		int count=0;
		ListNodeRot temp=head;
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
		
		 i %= arr.length;
	     reverse(arr, 0, arr.length - 1);
	     reverse(arr, 0, i - 1);
	     reverse(arr, i, arr.length - 1);
		
//		System.out.println(Arrays.toString(arr));
		temp=head;
		pos=0;
		while(temp!=null) {
			temp.data=arr[pos++];
			temp=temp.next;
		}
		return head;
	}

	private static void reverse(int[] arr, int i, int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
