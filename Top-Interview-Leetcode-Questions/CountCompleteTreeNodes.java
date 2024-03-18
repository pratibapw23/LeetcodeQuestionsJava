package dailyTargatedLeetcodeQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode1{
	int val;
	TreeNode1 left;
	TreeNode1 right;
	
	public TreeNode1(int val) {
		this.val=val;
	}
}
public class CountCompleteTreeNodes {
	static Scanner sc=null;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		TreeNode1 root=createTree();
		int nodeCount=countCompleteTreeNodes(root);
		System.out.println(nodeCount);
	}
	private static TreeNode1 createTree() {
		TreeNode1 root=null;
		System.out.println("Enter data for root");
		int val=sc.nextInt();
		if(val==-1)
			return null;
		
		root=new TreeNode1(val);
		
		System.out.println("Enter left for "+val);
		root.left=createTree();
		
		System.out.println("Enter right for "+val);
		root.right=createTree();
		
		return root;
	}
	private static int countCompleteTreeNodes(TreeNode1 root) {
		int count=0;
		Queue<TreeNode1> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			TreeNode1 curr=q.poll();
			count++;
			if(curr.left!=null)
				q.add(curr.left);
			if(curr.right!=null)
				q.add(curr.right);
		}
		return count;
	}

}
