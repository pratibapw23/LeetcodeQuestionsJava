package dataStructureImplementations;

import java.util.Scanner;

class TreeNode{
	TreeNode left;
	TreeNode right;
	int data;
	
	public TreeNode(int data) {
		this.data=data;
	}
}
public class BinaryTreeOperations {
	static Scanner sc=null;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		TreeNode root=createNode();
//		inorderTraversal(root);
//		preorderTraversal(root);
		postorderTraversal(root);
	}


	private static void inorderTraversal(TreeNode root) {
		if(root==null) return;
		
		inorderTraversal(root.left);
		System.out.println(root.data);
		inorderTraversal(root.right);
	}
	private static void preorderTraversal(TreeNode root) {
		if(root==null) return;
		
		System.out.println(root.data);
		preorderTraversal(root.left);
		preorderTraversal(root.right);
	}
	private static void postorderTraversal(TreeNode root) {
		if(root==null) return;
		
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.println(root.data);
		
	}


	private static TreeNode createNode() {
		TreeNode root=null;
		System.out.println("Enter data for root node");
		int data=sc.nextInt();
		if(data==-1) return null;
		
		root=new TreeNode(data);
		
		System.out.println("Enter left for "+data);
		root.left=createNode();
		
		System.out.println("Enter right for "+data);
		root.right=createNode();
		
		return root;
	}

}
