package dailyTargated.easy;

class ListNode3{
	int val;
	ListNode3 next;
	
	public ListNode3(int val){
		this.val=val;
	}
}
public class ConvertBinaryNumInLinkedListToInteger {

	public static void main(String[] args) {
		ListNode3 n1=new ListNode3(1);
		ListNode3 n2=new ListNode3(0);
		ListNode3 n3=new ListNode3(1);
		
		ListNode3 head=n1;n1.next=n2;n2.next=n3;n3.next=null;
		int decimalVal=getDecimalValue(head);
		System.out.println(decimalVal);
	}

	private static int getDecimalValue(ListNode3 head) {
		ListNode3 temp=head;
		StringBuilder str=new StringBuilder();
		while(temp!=null) {
			str.append(temp.val);
			temp=temp.next;
		}
		return Integer.parseInt(str.toString(),2);
	}

}
