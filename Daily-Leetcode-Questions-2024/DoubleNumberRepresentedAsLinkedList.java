package dailyLeetcodeQuestions2024;

class DoubleListNode{
	int val;
	DoubleListNode next;
	
	public DoubleListNode(int val) {
		this.val=val;
	}
}
public class DoubleNumberRepresentedAsLinkedList {

	public static void main(String[] args) {
		DoubleListNode n1=new DoubleListNode(1);
		DoubleListNode n2=new DoubleListNode(8);
		DoubleListNode n3=new DoubleListNode(9);
		
		DoubleListNode head=n1;n1.next=n2;n2.next=n3;n3.next=null;
		DoubleListNode node=doubleANumberReprepresentedAsLinkedList(head);
		display(node);
	}

	private static void display(DoubleListNode node) {
		DoubleListNode temp=node;
		while(temp!=null) {
			System.out.println(temp.val);
			temp=temp.next;
		}
	}

	private static DoubleListNode doubleANumberReprepresentedAsLinkedList(DoubleListNode head) {
		DoubleListNode temp=new DoubleListNode(0);
	        temp.next=head;

	        DoubleListNode left=temp;
	        DoubleListNode right=head;

	        while(right!=null){
	            if(right.val*2>=10){
	                left.val+=1;
	            }
	            right.val=(right.val*2)%10;
	            left=left.next;
	            right=right.next;
	        }
	        return temp.val>0?temp:head;
	}

}
