package dailyLeetcodeQuestions2024;

class DelNode{
	int data;
	DelNode next;
	
	public DelNode(int data) {
		this.data=data;
	}
}
public class DeleteNodeInLinkedList {

	public static void main(String[] args) {
		DelNode n1=new DelNode(4);
		DelNode n2=new DelNode(5);
		DelNode n3=new DelNode(1);
		DelNode n4=new DelNode(9);
		
		DelNode head=n1;n1.next=n2;n2.next=n3;n3.next=n4;n4.next=null;
		deleteNode(n2);
		display(head);
	}

	private static void display(DelNode node) {
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}

	private static void deleteNode(DelNode n2) {
		n2.data=n2.next.data;
		n2.next=n2.next.next;
	}

}
