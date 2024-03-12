package dailyTargatedLeetcodeQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int val) {
		this.val=val;
	}
}
public class LevelOrderTraversalBinaryTree {
	static Scanner sc=null;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		TreeNode root=createNode();
//		preorderTraversal(root);
	    levelOrdeTraversal(root);
	}
	private static void levelOrdeTraversal(TreeNode root) {
		List<List<Integer>> list=new ArrayList<>();
		List<Integer> l=new ArrayList<>();
		Queue<TreeNode> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			int s=q.size();
			while(s --> 0) {
				TreeNode current=q.poll();
//				System.out.println(current.val);
				l.add(current.val);
				if(current.left!=null)
					q.add(current.left);
				if(current.right!=null)
					q.add(current.right);
			}
			list.add(new ArrayList<>(l));
			l.clear();
		}
		System.out.println(list);
	}
	private static void preorderTraversal(TreeNode root) {
		if(root==null) return;
		
		System.out.println(root.val);
		preorderTraversal(root.left);
		preorderTraversal(root.right);
	}
	public static TreeNode createNode() {
		TreeNode root=null;
		System.out.println("Enter data for root node");
		int val=sc.nextInt();
		if(val==-1)
			return null;
		
		root=new TreeNode(val);
		
		System.out.println("Enter left for "+val);
		root.left=createNode();
		
		System.out.println("Enter right for "+val);
		root.right=createNode();
		return root;
		
	}

}
