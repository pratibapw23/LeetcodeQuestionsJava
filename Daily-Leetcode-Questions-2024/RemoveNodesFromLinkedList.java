package dailyLeetcodeQuestions2024;

import java.util.Stack;

class RemList{
	int val;
	RemList next;
	
	public RemList(int val) {
		this.val=val;
	}
}
public class RemoveNodesFromLinkedList {

	public static void main(String[] args) {
		RemList n1=new RemList(1);
		RemList n2=new RemList(1);
		RemList n3=new RemList(1);
		RemList n4=new RemList(1);
		RemList n5=new RemList(1);
		
		RemList head=n1;n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=null;
		
		RemList node=removNodes(head);
		display(node);
	}

	private static void display(RemList node) {
		RemList temp=node;
		while(temp!=null) {
			System.out.println(temp.val);
			temp=temp.next;
		}
	}

	private static RemList removNodes(RemList head) {
		
		//reverse the List
		
		RemList curr=head;
		RemList prev=null;
		while(curr!=null) {
			RemList temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		RemList prevNode=prev;
		RemList currNode=prev.next;
		
		while(currNode!=null) {
			if(currNode.val<prevNode.val) {
				currNode=currNode.next;
			}
			else {
				RemList nextNode=currNode.next;
				currNode.next=prevNode;
				prevNode=currNode;
				currNode=nextNode;
				
			}
		}
		prev.next=null;
		prev=prevNode;
		return prev;
	}

}
