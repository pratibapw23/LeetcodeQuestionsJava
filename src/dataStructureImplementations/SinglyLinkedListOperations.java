package dataStructureImplementations;


//define the Node class:

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data=data;
	}
}

public class SinglyLinkedListOperations {
	
	
	public static void main(String[] args) {

		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(40);
		Node n4=new Node(50);
		
		Node head=n1;
		n1.next=n2; n2.next=n3;n3.next=n4; n4.next=null;
		displayLinkedList(head);
//		insertNewElementAtZeroPos(100, head);
//		insertNewElementAtGivenPos(30,head,2);
//		deleteNodeAtFirstPos(head);
//		deleteNodeFromGivenPos(head, 2);
	}
	private static void displayLinkedList(Node head) {
		
		Node curr=head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	private static void insertNewElementAtZeroPos(int i, Node head) {
		Node newNode=new Node(i);
		newNode.next=head;
		head=newNode;
		System.out.println("After Inserting at zeroth position");
		displayLinkedList(head);
	}
	private static void insertNewElementAtGivenPos(int data, Node head, int pos) {
		Node newNode=new Node(data);
		if(pos!=0) {
			Node prev=head;
			for(int i=0;i<pos-1;i++) {
				prev=prev.next;
			}
			newNode.next=prev.next;
			prev.next=newNode;
		}
		System.out.println("After Inserting at given position");
		displayLinkedList(head);
	}
	private static void deleteNodeAtFirstPos(Node head) {
		head=head.next;
		System.out.println("After deletingnode at first position");
		displayLinkedList(head);
	}
	private static void deleteNodeFromGivenPos(Node head, int pos) {
		Node prev=head;
		for(int i=0;i<pos-1;i++) {
			prev=prev.next;
		}
		prev.next=prev.next.next;
		System.out.println("After deletingnode at given position");
		displayLinkedList(head);
	}

}
