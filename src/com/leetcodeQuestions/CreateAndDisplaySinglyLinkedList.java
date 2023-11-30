package com.leetcodeQuestions;
public class CreateAndDisplaySinglyLinkedList {
class Node{
	
	int data;
	Node next;
	
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}
	
	public Node head=null;
	public Node tail=null;
	
	public void addNode(int data) {
		
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			while(current!=null) {
				System.out.println(current.data);
				current=current.next;
			}
		}
	}
	public void addNodeAtBeginning(int data) {
		Node current=head;
		Node newNode=new Node(data);
		head=newNode;
		head.next=current;
	}



	public static void main(String[] args) {
		CreateAndDisplaySinglyLinkedList list=new CreateAndDisplaySinglyLinkedList();
		list.addNode(10);
		list.addNode(22);
		list.addNode(50);
//		list.display();
		list.addNodeAtBeginning(30);
		list.addNodeAtBeginning(5);
		list.addNodeAtBeginning(50);
		list.display();
	}


}
